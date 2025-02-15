@EmployeeSearch
Feature: Search Employee

	@smoke @sprint5
  Scenario: Search for Employee by ID
    Given the user is logged in with valid credentials
    And the user navigates to the employee list page
    When the user enters valid employee ID
    And clicks on the search button
    Then the employee information is displayed

  Scenario: Search for Employee by Name
    Given the user is logged in with valid credentials
    And the user navigates to the employee list page
    When the user enters valid employee name
    And clicks on the search button
    Then the employee information is displayed
