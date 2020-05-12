@automationPractice
Feature: Automation Practice
  Validate and Register a user

  Scenario: Register a user in Automaiton Practice Website
    Given I acess website
    When I click on reigster link from homepage
    And I enter a email address as "tes233t@gmail.com"
    When I click on Create Account Button
    Then I validate Registraiton Page
    And I enter detials
      | Mr | Test | User | pass@wordQ123 | 4 | 8 | 1992 | Signorra | St.Name street Loop | Anchorage | Alaska | 99501 | 902897323 | St open area |
    And I validate that I registered successfully
