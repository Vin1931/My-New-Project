Feature: SearchHotel Functionality

  @Smoke
  Scenario: validate the search hotel functionality with required data
    Given browser should be opened
    And user should available in the login page
    When usershould enters validusername and validpassword
    And userClicks Login button
    And user select required data in search hotel page
    And user Clicks search button
    Then user should sucessfully completed search Functionality
