@Parallel
Feature: Parallel Test 01

  Scenario: Google Test
    Given user goes to URL "https://google.com"
    When user prints the title
    Then close parallel driver

  Scenario: Instagram Test
    Given user goes to URL "https://instagram.com"
    When user prints the title
    Then close parallel driver

  Scenario: Facebook Test
    Given user goes to URL "https://facebook.com"
    When user prints the title
    Then close parallel driver

