$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Bharath Koye/eclipse-workspace/New folder/TestProject/src/test/resources/features/NamashiLogin.feature");
formatter.feature({
  "name": "Namashi Ecommerce website",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login for the Namashi website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should be namashi home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginNamashi.the_user_should_be_namashi_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user provide valid account details",
  "rows": [
    {
      "cells": [
        "uname",
        "pwd"
      ]
    },
    {
      "cells": [
        "bharath@gmail.com",
        "bharath12345"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginNamashi.the_user_provide_valid_account_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user login validate customer or not",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginNamashi.the_user_login_validate_customer_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});