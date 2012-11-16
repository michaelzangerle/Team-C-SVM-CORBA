package svm.corba.implementation;

import svm.corba.abstraction.SVMExportPOA;
import svm.corba.abstraction.cto.contest.CTOContest;
import svm.corba.abstraction.cto.match.CTOMatch;
import svm.corba.abstraction.cto.team.CTOTeam;
import svm.corba.abstraction.exceptions.RegisterException;
import svm.corba.abstraction.sequences.Contests;
import svm.corba.abstraction.sequences.Matches;
import svm.corba.abstraction.sequences.Teams;
import svm.corba.implementation.cto.CTOContestImpl;
import svm.corba.implementation.cto.CTOMatchImpl;
import svm.corba.implementation.cto.CTOTeamImpl;
import svm.corba.server.SVMCorbaServer;
import svm.logic.abstraction.LogicFacade;
import svm.logic.abstraction.controller.IContestController;
import svm.logic.abstraction.controller.ILoginController;
import svm.logic.abstraction.controller.ISearchController;
import svm.logic.abstraction.controller.ITeamController;
import svm.logic.abstraction.exception.IllegalGetInstanceException;
import svm.logic.abstraction.exception.NotAllowException;
import svm.logic.abstraction.transferobjects.ITransferAuth;
import svm.logic.abstraction.transferobjects.ITransferContest;
import svm.logic.abstraction.transferobjects.ITransferMatch;
import svm.logic.abstraction.transferobjects.ITransferTeam;
import svm.persistence.abstraction.exceptions.ExistingTransactionException;
import svm.persistence.abstraction.exceptions.NoSessionFoundException;
import svm.persistence.abstraction.exceptions.NoTransactionException;
import svm.persistence.abstraction.exceptions.NotSupportedException;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * ProjectTeam: Team C
 * Date: 14.11.12
 */
public class ExportImpl extends SVMExportPOA {
    private static String userName = "jwa8658";
    private static String password = "";

    private static ExportImpl instance;

    public static ExportImpl getInstance() throws NotSupportedException, ExistingTransactionException, IllegalGetInstanceException, NoSessionFoundException, NoTransactionException, InstantiationException, IllegalAccessException, RemoteException {
        if (instance == null) instance = new ExportImpl();
        return instance;
    }

    private ITransferAuth user;

    public ExportImpl() throws RemoteException, IllegalGetInstanceException, NoSessionFoundException, NotSupportedException, IllegalAccessException, InstantiationException, ExistingTransactionException, NoTransactionException {
        ILoginController login = LogicFacade.getLoginController();
        login.start();
        if (login.loginWithoutLdap(userName, password)) {
            user = login.getMember();
        }
        login.commit();
    }

    @Override
    public Teams getListOfTeams() throws RegisterException {
        ISearchController search = LogicFacade.getSearchController(user);
        Teams result = new Teams();
        try {
            search.start();
            List<ITransferTeam> teams = search.getTeams();

            result.teams = new CTOTeam[teams.size()];
            for (int i = 0; i < teams.size(); i++) {
                result.teams[i] = SVMCorbaServer.getInstance().addCTOTeam(new CTOTeamImpl(teams.get(i)));
            }
            search.commit();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSessionFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NotAllowException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ExistingTransactionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoTransactionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NotSupportedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return result;
    }

    @Override
    public Contests getListOfContestsByDate(long date) throws RegisterException {
        ISearchController search = LogicFacade.getSearchController(user);
        Contests result = new Contests();
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy.MM.dd");
        String searchDate = fmt.format(new Date(date));
        try {
            search.start();
            List<ITransferContest> contests = search.getContests();
            List<CTOContest> tmps = new LinkedList<CTOContest>();
            for (int i = 0; i < contests.size(); i++) {
                if (fmt.format(contests.get(i).getStart()).equals(searchDate)) {
                    tmps.add(SVMCorbaServer.getInstance().addCTOContest(new CTOContestImpl(contests.get(i))));
                }
            }
            result.contests = (CTOContest[]) tmps.toArray(new CTOContest[0]);
            search.commit();
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSessionFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NotAllowException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ExistingTransactionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoTransactionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NotSupportedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return result;
    }

    @Override
    public Contests getListOfContestsByTeam(CTOTeam team) {
        ITeamController teamController = LogicFacade.getTeamController(user, (ITransferTeam) SVMCorbaServer.getInstance().getCTO(team).getTransferObject());
        Contests result = new Contests();

        try {
            teamController.start();
            List<ITransferContest> contests = teamController.getContests();
            List<CTOContest> tmps = new LinkedList<CTOContest>();
            for (int i = 0; i < contests.size(); i++) {
                tmps.add(SVMCorbaServer.getInstance().addCTOContest(new CTOContestImpl(contests.get(i))));
            }
            result.contests = (CTOContest[]) tmps.toArray(new CTOContest[0]);
            teamController.commit();
        } catch (NoSessionFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NotSupportedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoTransactionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ExistingTransactionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RegisterException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return result;
    }

    @Override
    public Matches getListOfMatches(CTOContest contest) throws RegisterException {
        Matches result = new Matches();
        try {
            IContestController contestController = LogicFacade.getContestController(user, (ITransferContest) SVMCorbaServer.getInstance().getCTO(contest).getTransferObject());
            contestController.start();
            List<ITransferMatch> matches = contestController.getMatches();
            result.matches = new CTOMatch[matches.size()];
            for (int i = 0; i < matches.size(); i++) {
                result.matches[i] = SVMCorbaServer.getInstance().addCTOMatch(new CTOMatchImpl(matches.get(i)));
            }
            contestController.commit();
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (InstantiationException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoSessionFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IllegalGetInstanceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NotSupportedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (NoTransactionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (ExistingTransactionException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return result;
    }
}
