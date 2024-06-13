@Parameterizing
Feature: Parameterizing Feature

  Background: User goes to homepage
    Given user goes to homepage

  @PositiveParam
  Scenario: Positive login
    When user enters email "clarusway@hotmail.com"
    And user enters password "Clarusway.123"
    And user clicks on submit
    Then user validates sign in
    And user closes the browser

  @NegativeParam
  Scenario: Negative login
    When user enters email "wrong@hotmail.com"
    And user enters password "Clarusway.123"
    And user clicks on submit
    Then user validates error message
    And user closes the browser

  @NegativeParam2
  Scenario: Negative login
    When user enters email "clarusway@hotmail.com"
    And user enters password "xyz.123"
    And user clicks on submit
    Then user validates error message
    And user closes the browser

  @NegativeParam3
  Scenario: Negative login
    When user enters email "wrong@hotmail.com"
    And user enters password "xyz.123"
    And user clicks on submit
    Then user validates error message
    And user closes the browser

  @PositiveParam2
  Scenario: Positive login
    When user enters email "jasonsteel@gmail.com"
    And user enters password "Jason.123"
    And user clicks on submit
    Then user validates sign in
    And user closes the browser

  @PositiveParam3
  Scenario: Positive login
    When user enters email "clarusway_john@hotmail.com"
    And user enters password "John.123"
    And user clicks on submit
    Then user validates sign in
    And user closes the browser
