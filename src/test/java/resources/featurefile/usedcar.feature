Feature: Search functionality

  As a User I want to select used car on carsguide.com
  @Smoke, @Sanity,@Regression
  Scenario Outline: Search the used car with model

    Given I am on homepage
    When I mouse hover on buy+sell tab
    And   I click used cars link
    Then  I navigate to used car sale page
    And   I select make "<make>"
    And   I select model "<model>"
    And   I select location "<location>"
    And   I select price "<price>"
    And I click on Find My Next Car tab
    Then  I should see the make "<make>" in results
    Examples:
      | make   | model   | location               | price   |
      | Audi   | A3      | VIC - Central Victoria | $40,000 |
      | Audi   | A4      | NT - North             | $50,000 |
      | BMW    | 120d    | NSW - All              | $30,000 |
      | Honda  | Accord  | TAS - North            | $70,000 |
      | Toyota | Avensis | TAS - South            | $80,000 |
      | Jaguar | X Type  | SA - Adelaide          | $90,000 |
