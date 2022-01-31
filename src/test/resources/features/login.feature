@herokuapp
Feature: Login

  Scenario: Login successfully
    Given User opens the "Login" page
    When they fill the "username" field with "tomsmith"
    And they fill the "password" field with "SuperSecretPassword!"
    And they click on Login
    Then they see the "You logged into a secure area!" message

  Scenario: Login with invalid username
    Given User opens the "Login" page
    When they fill the "username" field with "invalid"
    And they fill the "password" field with "SuperSecretPassword!"
    And they click on Login
    Then they see the "Your username is invalid!" message

  Scenario: Login with invalid password
    Given User opens the "Login" page
    When they fill the "username" field with "tomsmith"
    And they fill the "password" field with "invalid"
    And they click on Login
    Then they see the "Your password is invalid!" message