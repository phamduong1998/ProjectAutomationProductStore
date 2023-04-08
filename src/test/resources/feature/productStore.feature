Feature: Feature Product Store



  @TEST
  Scenario Outline: Test
    Given I login with user "<userName>" and password "<password>"
    When I purchase galaxy s6 with "<customerName>" and "<country>", "<cityCustomer>", "<creditCard>", "<monthByProduct>", "<yearByProduct>"
    Examples:
      |userName|password|customerName |country|cityCustomer|creditCard|monthByProduct|yearByProduct|
      |Hailinh|123456   |Linh xinh gái|Độc lạ |Bình Dương  |  2803200 |3             |  2020       |