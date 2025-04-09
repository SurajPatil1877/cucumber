Feature: Application Login

  @Regression
  Scenario: Admin Page Default Login
    Given User is on Netbanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed


#  Scenario: User Page Default Login
#    Given User is on Netbanking landing page
#    When User login into application with "user" and password "5678"
#    Then Home Page is displayed
#    And Cards are displayed

  @SmokeTest
    @Regression
  Scenario Outline: User Page Default Login
    Given User is on Netbanking landing page
    When User login into application with "<Username>" and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples:
      | Username  | Password  |
      | debitUser | Debit1234 |
      | stockUser | stock1234 |


  @SmokeTest
  Scenario: User Page Default Signup
    Given User is on Practice Landing Page
    When User SignUp into application
      | suraj          |
      | patil          |
      | test@gmail.com |
      | 9833403409     |
    Then Home Page is displayed
    And Cards are displayed





    
