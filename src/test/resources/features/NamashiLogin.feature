@tag
Feature: Namashi Ecommerce website
  I want to use this template for my feature file

  @tag1
  Scenario: Login for the Namashi website
    Given The user should be namashi home page
    When The user provide valid account details
      | uname             | pwd          |
      | bharath@gmail.com | bharath12345 |
    Then The user login validate customer or not
