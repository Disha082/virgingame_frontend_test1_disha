Feature: Homepage Test
  As a user I want to on HomePage Of Virgin Games Website

  Scenario: User should navigate to on HomePage Successfully
    Given I am on HomePage
    When I click on accept cookies link
    Then I Verify the WelcomeText on HomePage
    And I click on Online Slots Button



