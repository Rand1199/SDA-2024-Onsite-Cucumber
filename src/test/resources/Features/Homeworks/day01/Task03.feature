Feature: Input Validation

  Background:
    Given I am on the input validation page

  Scenario: Fill form with valid data and submit
    Given I fill the form with valid data
    When I submit the form
    Then I should see the success message

  Scenario: Fill form with invalid data and submit
    Given I fill the form with invalid data
    When I submit the form
    Then I should see the error message