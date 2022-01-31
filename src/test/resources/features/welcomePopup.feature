@candymapper
Feature: Welcome popup

  Scenario: Closing the Welcome popup using the Find My Candy button
    Given the Welcome popup is displayed
    When User clicks the Find My Candy button on the Welcome popup
    Then the popup is closed