#Author: your.sangeeth@your.domain.com

@sangeeth  @san
Feature: Add Tariff plan

Background:
		Given user launches telecom applications
    And user click on add tariff plan button

  Scenario: Validate add tariff plan module
    
    When user need to fill up the fields by one dim list
      | 10 | 200 | 300 | 400 | 500 | 600 | 700 |
    And user click on submit button
    Then user verify Congratulation you add Tariff Plan is generated
@sangeeth @kumar @ram
  Scenario: Validate add tariff plan module
   
    When user need to fill up the fields by one dim map
      | rental      |   11 |
      | lname       | 2200 |
      | email       | 3300 |
      | addr        | 4400 |
      | telephoneno | 5500 |
      | addss       | 6600 |
      | tele        | 7700 |
    And user click on submit button
    Then user verify Congratulation you add Tariff Plan is generated

  Scenario: Validate add tariff plan module
    
    When user need to fill up the fields by two dim list
      | 11 | 21 | 31 | 41 | 500 | 600 | 700 |
      | 12 | 22 | 32 | 42 | 500 | 600 | 700 |
      | 13 | 23 | 33 | 43 | 500 | 600 | 700 |
    And user click on submit button
    Then user verify Congratulation you add Tariff Plan is generated

  Scenario: Validate add tariff plan module
    
    When user need to fill up the fields by two dim list
      | ren | lnm | ema | add | tele | san | pre |
      |  11 |  21 |  31 |  41 |  500 | 600 | 700 |
      |  12 |  22 |  32 |  42 |  500 | 600 | 700 |
      |  13 |  23 |  33 |  43 |  500 | 600 | 700 |
    And user click on submit button
    Then user verify Congratulation you add Tariff Plan is generated
