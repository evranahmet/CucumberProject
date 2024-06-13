@ScenarioOutline
Feature: Scenario Outline Feature

  Background: User goes to homepage
    Given user goes to homepage

  @PositiveTests
  Scenario Outline: PositiveTests
    When user enters email "<email>"
    And user enters password "<password>"
    And user clicks on submit
    Then user validates sign in
    And  user closes the browser
    Examples:
      | email                      | password      |
      | clarusway@hotmail.com      | Clarusway.123 |
      | jasonsteel@gmail.com       | Jason.123     |
      | clarusway_john@hotmail.com | John.123      |


  @NegativeTests
  Scenario Outline: NegativeTests
    When user enters email "<email>"
    And user enters password "<password>"
    And user clicks on submit
    And user validates error message
    And user closes the browser
    Examples:
      | email                 | password  |
      | clarusway@hotmail.com | xyz.123   |
      | wrong@gmail.com       | Jason.123 |
      | wrong@hotmail.com     | xyz.123   |
      |                       |           |
      | clarusway@hotmail.com |           |