@Parallel
Feature: Parallel Test 03

  Scenario: Clarusway Test
    Given user goes to URL "https://clarusway.com"
    When user prints the title
    Then close parallel driver