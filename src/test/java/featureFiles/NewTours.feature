@travel
Feature: New Tours
  Registration and

  Scenario Outline: New Tours Registration
    Given I navigate to new tours
    When I check on registration button
    And I enter first name as "<firstName>"
    And I enter last name as "<lastName>"
    And I enter Phone number as "<pno>"
    And I enter email address as "<email>"
    And I enter Address as "<address>"
    And I enter city as "<city>"
    And I enter state name as "<state>"
    And I enter postal code name as "<pcode>"
    And I select country as "<country>"
    And I enter user name as "<username>"
    And I give password for user as "<pass>"
    And I enter retype password as "<conpass>"
    When I click on Submit
    Then user should be registered

    Examples: 
      | firstName | lastName | pno       | email        | address         | city      | state     | pcode | country | username | pass    | conpass |
      | John      | Woodland | 987698808 | test@eml.com | St. pollard way | Bangalore | Karnataka | 80098 | India   | test1    | mercury | mercury |
      | Jack      | Yumber   | 987698808 | test@eml.com | St. pollard way | Bangalore | Karnataka | 80098 | India   | test2    | mercury | mercury |
      | aksjd     | Pollad   | 987698808 | test@eml.com | St. pollard way | Bangalore | Karnataka | 80098 | India   | test3    | mercury | mercury |
      | Lopes     | Jackob   | 987698808 | test@eml.com | St. pollard way | Bangalore | Karnataka | 80098 | India   | test4    | mercury | mercury |
      | Yesh      | Skiller  | 987698808 | test@eml.com | St. pollard way | Bangalore | Karnataka | 80098 | India   | test5    | mercury | mercury |
      | Moham     | Joggesg  | 987698808 | test@eml.com | St. pollard way | Bangalore | Karnataka | 80098 | India   | test6    | mercury | mercury |
      | Opend     | Kignston | 987698808 | test@eml.com | St. pollard way | Bangalore | Karnataka | 80098 | India   | test7    | mercury | mercury |
      | Oscar     | Merhud   | 987698808 | test@eml.com | St. pollard way | Bangalore | Karnataka | 80098 | India   | test8    | mercury | mercury |
      | name1     | Nods     | 987698808 | test@eml.com | St. pollard way | Bangalore | Karnataka | 80098 | India   | test9    | mercury | mercury |
      | Pond      | Hoodk    | 987698808 | test@eml.com | St. pollard way | Bangalore | Karnataka | 80098 | India   | test10   | mercury | mercury |
