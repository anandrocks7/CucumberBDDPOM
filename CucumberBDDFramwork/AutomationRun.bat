@echo off

title This is your first batch script!
echo Welcome to batch scripting!
pause


cd C:\Selenium_Project\CucumberBDDFramwork

mvn test -Dfilename="testng.xml"

pause

