#Author: your.sangeeth@your.domain.com

Feature: Add customer
  

  @tag1
  Scenario: validate add customer module
  	Given user launches telecom application
  	And user click on add customer button
		When user need to file up the fields
		And user click on submit  button
		Then user verify customer id is generated
     
  