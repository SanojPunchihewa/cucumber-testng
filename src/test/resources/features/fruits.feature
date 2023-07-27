Feature: Fruit Basket
  Scenario: Generating APK conf using the API definition
    Given I have a fruit basket with 3 apples and 5 oranges
    When I add 2 bananas to the basket
    Then I should have 10 fruits in the basket
