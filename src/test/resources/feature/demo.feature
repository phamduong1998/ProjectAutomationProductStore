Feature: Login Screen

  @TEST @TS-01
  Scenario Outline: login register
    Given I registerNewUser with user "<userName>" and password "<password>"
    When I login with user registed
    Then I should see homepage is displayed
    Examples:
      |userName|password |
      |Random  |Random   |