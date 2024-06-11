Feature: LoginFunctionality

  @Smoke
  Scenario Outline: Validate the Login Functionality with valid credential's
    Given browser is open
    And user is Available in Login Page
    When user enters <username> and <password>
    And user clicks Login button
    Then user should successfully completed login functionality
    And user navigated into properpage

    Examples: 
      | username | password  |
      | Vin      | Vinay     |
      | Vinay    | Vinay123  |
      | Vinay007 | Vinay@123 |
