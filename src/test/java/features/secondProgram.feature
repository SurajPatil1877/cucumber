Feature: Application Login

  Background:
    Given setup the entries in database
    When launch the browser from config variables
    And hit the home page url of banking site

  @NetBanking
  Scenario: User Page Default Login
    Given User is on NetBanking landing page
    When User login into application with "user" and password "5678"
    Then Home Page is displayed
    And Cards are displayed

  @SmokeTest
    @Regression
    @Mortgage
  Scenario Outline: Mortgage User Default Login
    Given User is on NetBanking landing page
    When User login into application with "<Username>" and password "<Password>"
    Then Home Page is displayed
    And Cards are displayed

    Examples:
      | Username  | Password  |
      | debitUser | Debit1234 |
      | stockUser | stock1234 |