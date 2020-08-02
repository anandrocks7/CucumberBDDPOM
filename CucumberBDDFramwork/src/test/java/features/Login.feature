@logintest @regression
Feature: CRM Login feature

Scenario Outline: CRM login test

Given user is on the login page
When title of the page is CogmentoCRM
Then user enters username '<username>' and password '<password>'
And user clicks on login button
Then user will navigate to home page.
When user clicks on logout link
Then user logged out successfully

Examples:
|username                |password   |
|er.anandsingh7@gmail.com |Crmtest123  |



Scenario: Test 2
Given user is on the login page
When title of the page is CogmentoCRM
Then user enters username '<username>' and password '<password>'
Then Test "2" is passed


Scenario: Test 3
Given user is on the login page
When title of the page is CogmentoCRM
Then user enters username '<username>' and password '<password>'
Then Test "3" will also be passed

