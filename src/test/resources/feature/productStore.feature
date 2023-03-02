Feature: Feature Product Store

  @TEST
  Scenario Outline: Test
    Given I login with user "<userName>" and password "<password>"
    When I purchase galaxy s6

    Examples:
      |userName|password|
      |Hailinh|123456   |