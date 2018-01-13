Feature: Login page test

  Scenario: Login to page

    Given I navigate to login page
    When I enter my "username" and "password"
    And I click submit button
    Then I should see the profile page



  #Scenario: Fill form