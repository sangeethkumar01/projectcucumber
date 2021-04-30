
package com.telecom.stepdefinition;



import com.telecom.resources.BaseCommonAction;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BaseCommonAction {

	
	@Before
	public void beforeScenario() {
		
		System.out.println("Before Scenario");
		
		launch("http://demo.guru99.com/telecom/");
	}
	@After
	public void afterscenario() {
		// TODO Auto-generated method stub
		System.out.println("after Scenario");

		driver.quit();
		
	}
}
