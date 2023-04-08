Feature: Feature Product Store

  @TEST
  Scenario Outline: Test
    Given I login with user "<userName>" and password "<password>"
    When I purchase galaxy s6 with "<customerName>" and "<country>", "<cityCustomer>", "<creditCard>", "<yearByProduct>"

    Examples:
      |userName|password|customerName|country|cityCustomer|creditCard|yearByProduct|
      |Hailinh|123456   |Linh Linh   |Độc lạ |Bình Dương  |  2803200 |2000          |