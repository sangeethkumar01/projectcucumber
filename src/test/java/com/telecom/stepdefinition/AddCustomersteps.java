package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AddCustomersteps {
public static WebDriver driver;
	
	
	@Given("user launches telecom application")
	public void user_launches_telecom_application() {
	   
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		//driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		 driver.findElement(By.xpath("//a[text() ='Add Tariff Plan']")).click();
	}

	@When("user need to file up the fields")
	public void user_need_to_file_up_the_fields() {
	    driver.findElement(By.xpath("(//label)[1]")).click();
	    driver.findElement(By.id("fname")).sendKeys("sangeeth");
	    driver.findElement(By.id("lname")).sendKeys("kumar");
	    driver.findElement(By.id("email")).sendKeys("sangeeth@gamil.com");
	    driver.findElement(By.name("addr")).sendKeys("trl");
	    driver.findElement(By.id("telephoneno")).sendKeys("54879632");
	}

	@When("user click on submit  button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
	   Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}


	@When("user need to file up the fields by one dim list")
	public void user_need_to_file_up_the_fields_by_one_dim_list(io.cucumber.datatable.DataTable dataTable) {
	   
		List<String> datas = dataTable.asList(String.class);
		 driver.findElement(By.xpath("(//label)[1]")).click();
		    driver.findElement(By.id("fname")).sendKeys(datas.get(0));
		    driver.findElement(By.id("lname")).sendKeys(datas.get(1));
		    driver.findElement(By.id("email")).sendKeys(datas.get(2));
		    driver.findElement(By.name("addr")).sendKeys(datas.get(3));
		    driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
		
	}
	
	@When("user need to file up the fields by one dim map")
	public void user_need_to_file_up_the_fields_by_one_dim_map(io.cucumber.datatable.DataTable dataTable) {
	    
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		
		driver.findElement(By.xpath("(//label)[1]")).click();
	    driver.findElement(By.id("fname")).sendKeys(datas.get("fnam"));
	    driver.findElement(By.id("lname")).sendKeys(datas.get("lnam"));
	    driver.findElement(By.id("email")).sendKeys(datas.get("emai"));
	    driver.findElement(By.name("addr")).sendKeys(datas.get("add"));
	    driver.findElement(By.id("telephoneno")).sendKeys(datas.get("telephonen"));
		
	}
	
	@When("user need to file up the fields by two dim list")
	public void user_need_to_file_up_the_fields_by_two_dim_list(io.cucumber.datatable.DataTable dataTable) {
	   
		List<List<String>> datas = dataTable.asLists(String.class);
		 driver.findElement(By.xpath("(//label)[1]")).click();
		    driver.findElement(By.id("fname")).sendKeys(datas.get(2).get(0));
		    driver.findElement(By.id("lname")).sendKeys(datas.get(0).get(1));
		    driver.findElement(By.id("email")).sendKeys(datas.get(2).get(2));
		    driver.findElement(By.name("addr")).sendKeys(datas.get(0).get(3));
		    driver.findElement(By.id("telephoneno")).sendKeys(datas.get(1).get(4));
		
	}

	@When("user need to file up the fields by two dim map")
	public void user_need_to_file_up_the_fields_by_two_dim_map(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String, String>> datas = dataTable.asMaps(String.class,String.class);
		 driver.findElement(By.xpath("(//label)[1]")).click();
		    driver.findElement(By.id("fname")).sendKeys(datas.get(2).get("fname"));
		    driver.findElement(By.id("lname")).sendKeys(datas.get(0).get("lname"));
		    driver.findElement(By.id("email")).sendKeys(datas.get(2).get("email"));
		    driver.findElement(By.name("addr")).sendKeys(datas.get(0).get("addr"));
		    driver.findElement(By.id("telephoneno")).sendKeys(datas.get(1).get("telephoneno"));
		
	}
}
