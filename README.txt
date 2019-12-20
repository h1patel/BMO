--------------------------------------------------------
searchrestaurants.feature
--------------------------------------------------------

@JustEat
Feature: Use the website to find restaurants
  		So that I can order food
  		As a hungry customer
 		I want to be able to find restaurants in my area

Background: Navigate to Just-Eat web site
	Given I am on the "https://www.just-eat.co.uk/" Just-Eat homepage

@Login
Scenario: Nagative Login to User Account
	Given I want to login to my user account
	When I use my "username@gmail.com" and "password" to login
	Then I should see a error message

@Search-restaurants
Scenario: Search for restaurants in an area
	Given I want food in "AR51 1AA"
	When I search for restaurants
	Then I should see some restaurants in "AR51 1AA"
	Then I should be able to search for my favourite "Pizza" restaurants from the list
	Then I want to be able to sort the restaurants as per Customer rating 
	And I want to view menu of the restaurant with highest rating

--------------------------------------------------------
This test has three Scenarios with total 10 Steps includes Background tag
--------------------------------------------------------

Background : This Tag is used to execute a common steps for all Scenarios in the feature file 
just like here it is used to perform a common steps of Setting up the environment 
for both Scenarios to open Chrome bowser and navigate to “https://www.just-eat.co.uk/”

Scenario 1 : In this Scenario, I have tried to test the login functionality with dummy UserName 
and Password which returns error and checked for error shows up

Ideally this Scenario should be under a different Feature but only for demonstration purpose 
it is included under same Feature heading given

Ideally while system in test environment, the CAPTCHA is turned off or 
a fixed response code is provided however with this system testing in 
production environment a user may get CAPTCHA after couple of failed tests

Scenario 2 : In this Scenario, I have 6 steps as it can be seen in the provided .feature file code

--------------------------------------------------------
Test setup & How to execute guide
--------------------------------------------------------

*Prerequisites
1) Java 1.8+ is installed  (https://java.com/en/download/help/windows_manual_download.xml)
2) Maven 3.6+ is installed (https://maven.apache.org/index.html)

Step-1 (Test Setup)
Copy this project in Windows file system in any desired folder

Step-2 (How to execute test)
Open Command prompt 
change directory to the project folder (e.g. C:\>cd Users\Admin) 

Step-3 (How to execute test)
use command 'mvn clean install' (e.g. C:\User\Admin\BMO> mvn clean install)
This command will execute project and will print all logs on console 

