Feature: Checkout on Demoblaze

  Scenario: Complete purchase process
    Given the user is on the Demoblaze home page
    When the user adds the first product to the cart
    And the user adds the second product to the cart
    And the user views the cart
    And the user completes the checkout form with details "John Doe", "USA", "New York", "4111111111111111", "12", "2025"
    Then the purchase should be completed successfully
