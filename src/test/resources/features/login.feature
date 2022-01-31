Feature: Login
  As Sebastian, a security-conscious user
  I want to access the secure area
  So I can do my business there.

  Scenario: Login successfully
    Given Sebastian opens the "Login" page
    When he fills the "username" field with "tomsmith"
    And he fills the "password" field with "SuperSecretPassword!"
    And he clicks on Login
    Then he sees the "You logged into a secure area!" message

  Scenario: Login with invalid username
    Given Sebastian opens the "Login" page
    When he fills the "username" field with "invalid"
    And he fills the "password" field with "SuperSecretPassword!"
    And he clicks on Login
    Then he sees the "Your username is invalid!" message

  Scenario: Login with invalid password
    Given Sebastian opens the "Login" page
    When he fills the "username" field with "tomsmith"
    And he fills the "password" field with "invalid"
    And he clicks on Login
    Then he sees the "Your password is invalid!" message