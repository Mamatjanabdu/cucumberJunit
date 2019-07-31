

Feature: Amazon Titile
  @amazon
  Scenario: Amazon Title Verfication
    When user goes to Amazon application
    Then user slhoudl see proper title

    Scenario: Amazon url verivication
    Given user is on the amazon homepage
    When user goes to amazon application
      Then user should validate url

