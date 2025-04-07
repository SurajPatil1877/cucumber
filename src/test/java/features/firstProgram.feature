Feature: Application Login

  Scenario: Admin Page Default Login
    Given User is on Netbanking landing page
    When User login into application
    Then Home Page is displayed
    And Cards are displayed
    
