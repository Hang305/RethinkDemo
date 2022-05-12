Feature: Calculating the insurance premium

  @RET-108
  Scenario: Verify that the insurance premium result shows correctly when the user answers all questions using TC1's data
    Given Open home page
    When Click "Calculate your premium here" button
    And Answer all questions
    Then The insurance premium appears correctly
