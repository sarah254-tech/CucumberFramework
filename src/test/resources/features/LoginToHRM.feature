@Login
Feature: Login Functionality

  @regression
  Scenario: Valid Login to HRM
    #  Given I navigated to HRM website
    When I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I validate that I am logged in

  #  And I quit the browser
  @smoke
  Scenario: Invalid Login
    #  Given I navigated to HRM website
    When I enter a valid username
    And I enter an invalid password
    And I click on the login button
    Then I validate that Invalid Credentials is displayed

  #  And I quit the browser
  @HW3
  Scenario Outline: Login using Outline and Examples Table
    When I enter valid "<username>" and "<password>"
    And I click on the login button
    Then verify that "<employeeName>" is displayed

    Examples: 
      | username   | password   | employeeName |
      | arminarmin | Armin@2025 | Armin Arlert |
      | ereneren   | Eren@2025  | Eren Yeager  |
      
	@HW3
  Scenario: Login using DataTable
    When user enters username and passowrd and clicks on the login button
      | username   | password   | employeeName |
      | arminarmin | Armin@2025 | Armin Arlert |
      | ereneren   | Eren@2025  | Eren Yeager  |
