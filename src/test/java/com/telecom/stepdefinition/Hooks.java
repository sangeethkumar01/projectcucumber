
package com.telecom.stepdefinition;



import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before Scenario");

		
	}
	@After
	public void afterscenario() {
		// TODO Auto-generated method stub
		System.out.println("after Scenario");

		
	}
}
