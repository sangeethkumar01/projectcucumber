package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.objectrepository.AddCustomerPageLoc;
import com.telecom.resources.BaseCommonAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AddCustomersteps extends BaseCommonAction {
public static WebDriver driver;
	
	BaseCommonAction bc = new BaseCommonAction();
	AddCustomerPageLoc ac = new AddCustomerPageLoc();

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		bc.button(ac.getAddcustomerbtm());
		
	}

	@When("user need to file up the fields")
	public void user_need_to_file_up_the_fields() {
	    bc.button(ac.getDonebtn());
	    bc.insertText(ac.getFirstname(), "sangeeth");
	    bc.insertText(ac.getLastname(), "kumar");
	    bc.insertText(ac.getEmail(), "sangeeth@gmail.com");
	    bc.insertText(ac.getAddrs(), "trl" );
	    bc.insertText(ac.getTelephone(), "789654123");
	}

	@When("user click on submit  button")
	public void user_click_on_submit_button() {
	    bc.button(ac.getSubmit());
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
	   Assert.assertTrue(ac.getCustomerID().isDisplayed());
	}


	@When("user need to file up the fields by one dim list")
	public void user_need_to_file_up_the_fields_by_one_dim_list(io.cucumber.datatable.DataTable dataTable) {
	   
		List<String> datas = dataTable.asList(String.class);
		bc.button(ac.getDonebtn());
		bc.insertText(ac.getFirstname(), datas.get(0));
	    bc.insertText(ac.getLastname(), datas.get(1));
	    bc.insertText(ac.getEmail(), datas.get(2));
	    bc.insertText(ac.getAddrs(), datas.get(3));
	    bc.insertText(ac.getTelephone(), datas.get(4));
		
	}
	
	@When("user need to file up the fields by one dim map")
	public void user_need_to_file_up_the_fields_by_one_dim_map(io.cucumber.datatable.DataTable dataTable) {
	    
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		
		bc.button(ac.getDonebtn());
		bc.insertText(ac.getFirstname(), datas.get("fnam"));
	    bc.insertText(ac.getLastname(), datas.get("lnam"));
	    bc.insertText(ac.getEmail(), datas.get("emai"));
	    bc.insertText(ac.getAddrs(), datas.get("add"));
	    bc.insertText(ac.getTelephone(), datas.get("telephonen"));
		
	}
	
	@When("user need to file up the fields by two dim list")
	public void user_need_to_file_up_the_fields_by_two_dim_list(io.cucumber.datatable.DataTable dataTable) {
	   
		List<List<String>> datas = dataTable.asLists(String.class);
		bc.button(ac.getDonebtn());
		bc.insertText(ac.getFirstname(), datas.get(2).get(0));
	    bc.insertText(ac.getLastname(), datas.get(2).get(1));
	    bc.insertText(ac.getEmail(), datas.get(2).get(2));
	    bc.insertText(ac.getAddrs(), datas.get(2).get(3));
	    bc.insertText(ac.getTelephone(), datas.get(2).get(4));
		
	}

	@When("user need to file up the fields by two dim map")
	public void user_need_to_file_up_the_fields_by_two_dim_map(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String, String>> datas = dataTable.asMaps(String.class,String.class);
		bc.button(ac.getDonebtn());
		bc.insertText(ac.getFirstname(), datas.get(2).get("fname"));
	    bc.insertText(ac.getLastname(), datas.get(2).get("lname"));
	    bc.insertText(ac.getEmail(), datas.get(2).get("email"));
	    bc.insertText(ac.getAddrs(), datas.get(2).get("addr"));
	    bc.insertText(ac.getTelephone(), datas.get(2).get("telephoneno"));
		
	}
}
