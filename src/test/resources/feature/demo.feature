Feature: Login Screen


  @TEST @TS-06
  Scenario Outline: Successful purchase
    Given I login with user "<userName>" and password "<password>"
    When I purchase galaxy s6 with "<customerName>" and "<country>", "<cityCustomer>", "<creditCard>", "<monthByProduct>", "<yearByProduct>"
    Then I should see message purchase "<message>"
    Examples:
      |userName|password|customerName |country  |cityCustomer  |creditCard   |monthByProduct|yearByProduct|message                      |
      |Hailinh |123456  |Linh         |Viet Nam |Hà Nội        |  2803200    |3             |  2020       |Thank you for your purchase! |

  @TEST @TS-07
  Scenario Outline: Fail purchase empty customerName
    Given I login with user "<userName>" and password "<password>"
    When I purchase galaxy s6 with "<customerName>" and "<country>", "<cityCustomer>", "<creditCard>", "<monthByProduct>", "<yearByProduct>"
    Then I should see message purchase "<message>"
    Examples:
      |userName|password|customerName |country  |cityCustomer  |creditCard   |monthByProduct|yearByProduct|message                      |
      |Hailinh |123456  |             |Viet Nam |Hà Nội        |  2803200    |3             |  2020       |Please fill out Name and Creditcard. |

  @TEST @TS-08
  Scenario Outline: Fail purchase empty Creditcard
    Given I login with user "<userName>" and password "<password>"
    When I purchase galaxy s6 with "<customerName>" and "<country>", "<cityCustomer>", "<creditCard>", "<monthByProduct>", "<yearByProduct>"
    Then I should see message purchase "<message>"
    Examples:
      |userName|password|customerName |country  |cityCustomer  |creditCard   |monthByProduct|yearByProduct|message                      |
      |Hailinh |123456  |Linh         |Viet Nam |Hà Nội        |             |3             |  2020       |Please fill out Name and Creditcard. |