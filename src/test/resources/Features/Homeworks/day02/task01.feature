Feature: Scenario Outline Task01

  Scenario Outline:
    Given the user navigates to the "<page_url>" page
    Then the user waits for 5 seconds
    And the user verifies that the page title contains "<keyword>"
    And  the user close the page
    Examples:
      | page_url                 | keyword  |
      | "https://www.google.com" | Google   |
      | "https://www.amazon.com"   | Amazon   |
      | "https://www.trendyol.com" | Trendyol |