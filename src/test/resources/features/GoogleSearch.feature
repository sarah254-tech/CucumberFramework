Feature: Searching in Google

  Scenario: Search by Typing
    Given I navigated to google.com
    When I type something in the search box
    And I click the search button
    Then I can see the results of my search
    And I can see the number of results returned

	@smoke
  Scenario: Search by Voice
    Given I navigated to google.com
    When I say what I want to search for
    Then I can see the results of my search
    And I can see the number of results returned
