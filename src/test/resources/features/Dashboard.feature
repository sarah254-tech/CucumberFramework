Feature: Dashboard Menu

  @menu
  Scenario: Dashboard menu items for Admin
    Given the user is logged in with valid credentials
    Then I want to validate the items on the menu
      | Admin           |
      | PIM             |
      | My Info         |
      | Discipline      |
      | Reports Catalog |
      | More            |
      | Maintenance     |
