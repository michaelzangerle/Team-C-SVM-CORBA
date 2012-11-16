@echo off
start orbd -ORBInitialPort 900
java -jar out\artifacts\Team-C-SVM-Corba-Server.jar
pause