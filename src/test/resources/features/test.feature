Feature: this is my first Feature

  @google
  Scenario: Google search scenario
    When user goes to goole application
    Then user searches for apple
    And user shoudl see apple related results
    And user tests something