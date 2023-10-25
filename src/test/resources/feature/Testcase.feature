Feature: Login Screen

  @TEST @TS-01
  Scenario Outline: login success
    Given I login with user "<userName>" and password "<password>"
    Then I should see homepage is displayed
    Examples:
      |userName|password |
      |hailinh |123456   |


  @TEST @TS-02
  Scenario Outline: Empty username
    Given I login with user "<userName>" and password "<password>"
    Then I should see message "<message>"
    Examples:
      |userName|password|message|
      |        |123456   |Please fill out Username and Password.|

  @TEST @TS-03
  Scenario Outline: Empty password
    Given I login with user "<userName>" and password "<password>"
    Then I should see message "<message>"
    Examples:
      |userName|password|message|
      |hailinh|         |Please fill out Username and Password.|

  @TEST @TS-04
  Scenario Outline: Wrong username
    Given I login with user "<userName>" and password "<password>"
    Then I should see message "<message>"
    Examples:
      |userName   |password |message|
      |hailinh2000|123456   |User does not exist.|

  @TEST @TS-05
  Scenario Outline: Wrong password
    Given I login with user "<userName>" and password "<password>"
    Then I should see message "<message>"
    Examples:
      |userName   |password     |message|
      |hailinh    |123456@#$%   |Wrong password.|

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

  @TEST @TS-09
  Scenario Outline: login register
    Given I registerNewUser with user "<userName>" and password "<password>"
    When I login with user registed
    Then I should see homepage is displayed
    Examples:
      |userName|password |
      |Random  |Random   |

  @TEST @TS-10
  Scenario Outline: login register empty username
    Given I registerNewUser with user "<userName>" and password "<password>"
    Then I should see message register "<message>"
    Examples:
      |userName|password |message|
      |        |Random   |Please fill out Username and Password.|

  @TEST @TS-11
  Scenario Outline: login register empty password
    Given I registerNewUser with user "<userName>" and password "<password>"
    Then I should see message register "<message>"
    Examples:
      |userName|password |message|
      |Random  |         |Please fill out Username and Password.|


  @TEST @TS-12
  Scenario Outline: login register with registered user
    Given I registerNewUser with user "<userName>" and password "<password>"
    Then I should see message register "<message>"
    Examples:
      |userName|password |message|
      |Hailinh |123456   |This user already exist.|

  @TEST @TS-13
  Scenario Outline: login register username password empty
    Given I registerNewUser with user "<userName>" and password "<password>"
    Then I should see message register "<message>"
    Examples:
      |userName|password |message|
      |        |         |Please fill out Username and Password.|

  @TEST @TS-14
  Scenario Outline: Verify title
    Given I login with user "<userName>" and password "<password>"
    When I should see homepage is displayed
    Then I should see title "<title>"
    Examples:
      |userName|password |title|
      |Hailinh |123456   |STORE|


  @TEST @TS-15
  Scenario Outline: Verify menu
    Given I login with user "<userName>" and password "<password>"
    When I should see homepage is displayed
    Then I should see menu is displayed
    Examples:
      |userName|password |
      |Hailinh |123456   |


  @TEST @TS-16
  Scenario Outline: Verify categories
    Given I login with user "<userName>" and password "<password>"
    When I should see homepage is displayed
    Then I should see categories is displayed
    Examples:
      |userName|password |
      |Hailinh |123456   |

  @TEST @TS-17
  Scenario Outline: Verify product phones
    Given I login with user "<userName>" and password "<password>"
    When I should see homepage is displayed
    Then I should see product phones is displayed
    Examples:
      |userName|password |
      |Hailinh |123456   |

  @TEST @TS-18
  Scenario Outline: Verify product laptops
    Given I login with user "<userName>" and password "<password>"
    When I should see homepage is displayed
    Then I should see product laptops is displayed
    Examples:
      |userName|password |
      |Hailinh |123456   |

  @TEST @TS-19
  Scenario Outline: Verify product monitors
    Given I login with user "<userName>" and password "<password>"
    When I should see homepage is displayed
    Then I should see product monitors is displayed
    Examples:
      |userName|password |
      |Hailinh |123456   |


