@airasia
Feature: Air Asia Search and login
  validating login and serch flight scenario

  Background: 
    Given I access the website
    And I Verify its TitleClick on "flights" Icon

  Scenario: Add 5 users to User Management Table
    When Enter Origin as "Bengaluru"
    And Enter Destination as "Pune"
    And Select depart date as "15/12/2020" also Select Return date as "One Way"
    When I Click on Search Button
    Then Verify that you are navigated successfully to search flight page

  Scenario: login error validation
    When I click on login button
    And I enter usernme as "a@gmail.com"
    And I enter password as "India1234"
    When I click on Sign In button
    Then I verify that error messgae contains "Your log in attempts has been unsuccessful."
