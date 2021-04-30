package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.resources.BaseCommonAction;

public class AddCustomerPageLoc extends BaseCommonAction{

	public AddCustomerPageLoc() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Add Customer'])[1]")
	private WebElement addcustomerbtm;
	
	@FindBy(xpath="(//label)[1]")
	private WebElement donebtn;
	
	@FindBy(id="fname")
	private WebElement firstname;
	
	@FindBy(id="lname")
	private WebElement lastname;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="addr")
	private WebElement addrs;
	
	@FindBy(id="telephoneno")
	private WebElement telephone;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	
	@FindBy(xpath="(//td[@align='center'])[2]")
	private WebElement customerID;

	public WebElement getAddcustomerbtm() {
		return addcustomerbtm;
	}

	public WebElement getDonebtn() {
		return donebtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddrs() {
		return addrs;
	}

	public WebElement getTelephone() {
		return telephone;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCustomerID() {
		return customerID;
	}
	
	
}
