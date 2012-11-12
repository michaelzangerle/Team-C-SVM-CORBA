@echo off
echo -----------------------------------
echo --      Generate IDL Files       --
echo -----------------------------------

echo -
echo -- Remove old generated Files
rmdir /s /q svm

echo -
echo -- Generate Exceptions
idlj -fall exceptions/RegisterException.idl
idlj -fall exceptions/ControllerNotStartedException.idl
idlj -fall exceptions/UnknownException.idl
idlj -fall exceptions/AuthNotFoundException.idl
idlj -fall exceptions/AttributeException.idl
idlj -fall exceptions/NotAllowException.idl

echo -
echo -- Generate CTO's
echo -- -- CTO
idlj -fall cto/CTO.idl
echo -- -- CTOAuth
idlj -fall cto/CTOAuth.idl
echo -- -- CTOContest
idlj -fall cto/CTOContest.idl
echo -- -- CTOLocation
idlj -fall cto/CTOLocation.idl
echo -- -- CTOMatch
idlj -fall cto/CTOMatch.idl
echo -- -- CTOMember
idlj -fall cto/CTOMember.idl
echo -- -- CTOTeam
idlj -fall cto/CTOTeam.idl

echo -
echo -- Generate Controller
echo -- -- Controller
idlj -fall controller/Controller.idl
echo -- -- CorbaLoginController
idlj -fall controller/CorbaLoginController.idl
echo -- -- CorbaMemberController
idlj -fall controller/CorbaMemberController.idl

echo -
echo -- Generate Export
idlj -fall Export.idl
echo -- Generate ControllerFactory
idlj -fall CorbaControllerFactory.idl

echo -
echo -----------------------------------
echo --      End of Generation        --
echo -----------------------------------