Feature: Search functionality

  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on buy+sell tab
    And I click Search Cars link
    Then I navigate to new and used car search page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make       | model   | location         | price   |
      | Mitsubishi | Delica  | NSW - Hunter     | $5,000  |
      | Audi       | A4      | QLD - Gold Coast | $50,000 |
      | BMW        | 120d    | VIC - Melbourne  | $60,000 |
      | Honda      | Accord  | TAS - North      | $70,000 |
      | Toyota     | Avensis | TAS - South      | $80,000 |
      | Jaguar     | X Type  | SA - Adelaide    | $90,000 |

