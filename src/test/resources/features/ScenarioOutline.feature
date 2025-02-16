Feature: Scenario Outline Example
	
	@outline
  Scenario Outline: 
    When Login with "<username>" and "<password>"
    And Click on the login button
    Then Validate that "<username>" is displayed
    And We want to say Bye "<fullname>"

    Examples: 
      | username | password | fullname      |
      | Harun    | h1234    | Harun Akengin |
      | May      | m1234    | May Obama     |
      | Carolina | c1234    | Carolina H    |
