@tag
Feature: Namashi Ecommerce website
  I want to use this template for my feature file

  @tag1
  Scenario: Registration for the Namashi website
    Given The user should be namashi home page and click the account
    When The user provide valid registration details
      | fname   | lname | mail             | password     | repassword   | gender |
      | Bharath | kumar | bharat@gmail.com | bharath12345 | bharath12345 | male   |
    Then The user validate customer id is generated or not
