#Author: your.sangeeth@your.domain.com
Feature: Add Customer

  Scenario: validate add customer module
    Given user launches telecom application
    And user click on add customer button
    When user need to file up the fields
    And user click on submit  button
    Then user verify customer id is generated

  Scenario: validate add customer module
    Given user launches telecom application
    And user click on add customer button
    When user need to file up the fields by one dim list
      | san | kumar | kumar@jmail.com | thiruvallur | 546321789 |
    And user click on submit  button
    Then user verify customer id is generated

  Scenario: validate add customer module
    Given user launches telecom application
    And user click on add customer button
    When user need to file up the fields by one dim map
      | fnam       | sangee         |
      | lnam       | kuma           |
      | emai       | kuma@gamil.com |
      | add        | tHiru          |
      | telephonen |      457896321 |
    And user click on submit  button
    Then user verify customer id is generated

  Scenario: validate add customer module
    Given user launches telecom application
    And user click on add customer button
    When user need to file up the fields by two dim list
      | san1 | kumar1 | kumar@jmail.com | thiruvallur | 546321789 |
      | san2 | kumar2 | kumar@jmail.com | thiruvallur | 546321789 |
      | san3 | kumar3 | kumar@jmail.com | thiruvallur | 546321789 |
    And user click on submit  button
    Then user verify customer id is generated

  Scenario: validate add customer module
    Given user launches telecom application
    And user click on add customer button
    When user need to file up the fields by two dim list
      | fname | lname  | email           | addr        | telephoneno |
      | san1  | kumar1 | kumar@jmail.com | thiruvallur |   546321789 |
      | san2  | kumar2 | kumar@jmail.com | thiruvallur |   546321789 |
      | san3  | kumar3 | kumar@jmail.com | thiruvallur |   546321789 |
    And user click on submit  button
    Then user verify customer id is generated
