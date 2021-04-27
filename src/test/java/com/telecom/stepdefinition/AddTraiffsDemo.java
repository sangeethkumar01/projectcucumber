package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTraiffsDemo {
	public static WebDriver driver;
	
	@Given("user launches telecom applications")
	public void user_launches_telecom_applications() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("user click on add tariff plan button")
	public void user_click_on_add_tariff_plan_button() {
		driver.findElement(By.xpath("//a[text() ='Add Tariff Plan']")).click();
		
	}

	@When("user need to fill up the fields by one dim list")
	public void user_need_to_fill_up_the_fields_by_one_dim_list(io.cucumber.datatable.DataTable dataTable) {
	   
		List<String> tra = dataTable.asList();
		driver.findElement(By.id("rental1")).sendKeys(tra.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(tra.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(tra.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(tra.get(3)); 
		
		driver.findElement(By.id("minutes_charges")).sendKeys(tra.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(tra.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(tra.get(6));
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
	   driver.findElement(By.xpath("//input[@name ='submit']")).click();
	}

	@Then("user verify Congratulation you add Tariff Plan is generated")
	public void user_verify_Congratulation_you_add_Tariff_Plan_is_generated() {
	  Assert.assertEquals("Congratulation you add Tariff Plan", driver.findElement(By.xpath("//h2")).getText());
	}

	@When("user need to fill up the fields by one dim map")
	public void user_need_to_fill_up_the_fields_by_one_dim_map(DataTable dataTable) {
	   
		Map<String, String> datamap = dataTable.asMap(String.class, String.class);
		
		driver.findElement(By.id("rental1")).sendKeys(datamap.get("rental"));
		driver.findElement(By.id("local_minutes")).sendKeys(datamap.get("lname"));
		driver.findElement(By.id("inter_minutes")).sendKeys(datamap.get("email"));
		driver.findElement(By.id("sms_pack")).sendKeys(datamap.get("addr")); 	
		driver.findElement(By.id("minutes_charges")).sendKeys(datamap.get("telephoneno"));
		driver.findElement(By.id("inter_charges")).sendKeys(datamap.get("addss"));
		driver.findElement(By.id("sms_charges")).sendKeys(datamap.get("tele"));
	}
	

@When("user need to fill up the fields by two dim list")
public void user_need_to_fill_up_the_fields_by_two_dim_list(io.cucumber.datatable.DataTable dataTable) {
    
	List<List<String>> datalist = dataTable.asLists(String.class);
	
	driver.findElement(By.id("rental1")).sendKeys(datalist.get(2).get(0));
	driver.findElement(By.id("local_minutes")).sendKeys(datalist.get(2).get(1));
	driver.findElement(By.id("inter_minutes")).sendKeys(datalist.get(1).get(0));
	driver.findElement(By.id("sms_pack")).sendKeys(datalist.get(2).get(0)); 	
	driver.findElement(By.id("minutes_charges")).sendKeys(datalist.get(2).get(0));
	driver.findElement(By.id("inter_charges")).sendKeys(datalist.get(2).get(1));
	driver.findElement(By.id("sms_charges")).sendKeys(datalist.get(2).get(2));
}
	
@When("user need to fill up the fields by two dim map")
public void user_need_to_fill_up_the_fields_by_two_dim_map(io.cucumber.datatable.DataTable dataTable) {
    
	List<Map<String, String>> datamaps = dataTable.asMaps(String.class,String.class);
	
	driver.findElement(By.id("rental1")).sendKeys(datamaps.get(2).get("ren"));
	driver.findElement(By.id("local_minutes")).sendKeys(datamaps.get(2).get("lnm"));
	driver.findElement(By.id("inter_minutes")).sendKeys(datamaps.get(2).get("ema"));
	driver.findElement(By.id("sms_pack")).sendKeys(datamaps.get(2).get("add")); 	
	driver.findElement(By.id("minutes_charges")).sendKeys(datamaps.get(2).get("tele"));
	driver.findElement(By.id("inter_charges")).sendKeys(datamaps.get(2).get("san"));
	driver.findElement(By.id("sms_charges")).sendKeys(datamaps.get(2).get("pre"));
}
}
