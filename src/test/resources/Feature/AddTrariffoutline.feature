#Author: your.sangeeth@your.domain.com
Feature: add tariff plan module

  Scenario Outline: Validate add tariff plan modules
    Given user launches telecom applicationss
    And user click on add tariff plan buttons
    When user need to fill up the field "<AA>","<AB>","<AC>","<AD>","<AE>","<AF>","<AG>"
    And user click on submit buttons
    Then user verify Congratulation you add Tariff Plan is generateds

    Examples: 
      | AA  | AB  | AC  | AD  | AE  | AF  | AG  |
      | 111 | 211 | 311 | 411 | 511 | 611 | 711 |
      | 112 | 212 | 312 | 412 | 512 | 612 | 712 |
      | 113 | 213 | 333 | 413 | 513 | 612 | 713 |
      | 114 | 214 | 334 | 414 | 514 | 613 | 714 |
