@JustEat
Feature: Use the website to find restaurants
  			So that I can order food
  			As a hungry customer
 			  I want to be able to find restaurants in my area

Background: Navigate to Just-Eat web site
Given I am on the "https://www.just-eat.co.uk/" Just-Eat homepage

@Login
Scenario Outline: Nagative Login to User Account
Given I want to login to my user account
When I use my wrong <userName> and <password>
Then I should see a error message

Examples:
|	userName					|	password	|
|	hansal@gmail.com	|	test111		|
|	test1@gmail.com		|	test222		|
 
@Search-restaurants
Scenario: Search for restaurants in an area
Given I want food in "AR51 1AA"
When I search for restaurants
Then I should see some restaurants in "AR51 1AA"
Then I should be able to search for my favourite "Pizza" restaurants from the list
Then I want to be able to sort the restaurants as per Customer rating 
And I want to view menu of the restaurant with highest rating

