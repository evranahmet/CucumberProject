@Login
Feature: Login Test

#  Herbir scenario öncesi çalışır
  Background: User goes to homepage
    Given user goes to homepage


  @PositiveLogin @SecondTag @Smoke
  Scenario: Positive login Test

    When user enters email
    And user enters password
    And user clicks on submit
    Then user validates sign in
    And user closes the browser

  @NegativeLogin @Negative
  Scenario: Negative login Test Wrong Email

    When user enters wrong email
    And user enters password
    And user clicks on submit
    Then user validates error message
    And user closes the browser

  @NegativeLoginWrongPassword @Negative
  Scenario: Negative login Test Wrong Password

    When user enters email
    And user enters wrong password
    And user clicks on submit
    Then user validates error message
    And user closes the browser

  @NegativeLoginEmptyPassword @Negative @Smoke
  Scenario: Negative login Test Empty Password

    When user enters email
    And user clicks on submit
    Then user validates error message
    And user closes the browser