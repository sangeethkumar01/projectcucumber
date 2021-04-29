package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTraffoutlines {

	public static WebDriver driver;
	
	@Given("user launches telecom applicationss")
	public void user_launches_telecom_applicationss() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		driver.manage().window().maximize();
	}

	@Given("user click on add tariff plan buttons")
	public void user_click_on_add_tariff_plan_buttons() {
		driver.findElement(By.xpath("//a[text() ='Add Tariff Plan']")).click();
	}

	@When("user need to fill up the field {string},{string},{string},{string},{string},{string},{string}")
	public void user_need_to_fill_up_the_field(String string, String string2, String string3, String string4, String string5, String string6, String string7) {

		driver.findElement(By.id("rental1")).sendKeys(string);
		driver.findElement(By.id("local_minutes")).sendKeys(string2);
		driver.findElement(By.id("inter_minutes")).sendKeys(string3);
		driver.findElement(By.id("sms_pack")).sendKeys(string4); 
		driver.findElement(By.id("minutes_charges")).sendKeys(string5);
		driver.findElement(By.id("inter_charges")).sendKeys(string6);
		driver.findElement(By.id("sms_charges")).sendKeys(string7);
	}

	@When("user click on submit buttons")
	public void user_click_on_submit_buttons() {
		driver.findElement(By.xpath("//input[@name ='submit']")).click();
	
	}

	@Then("user verify Congratulation you add Tariff Plan is generateds")
	public void user_verify_Congratulation_you_add_Tariff_Plan_is_generateds() {
		Assert.assertEquals("Congratulation you add Tariff Plan", driver.findElement(By.xpath("//h2")).getText());
	}
}
