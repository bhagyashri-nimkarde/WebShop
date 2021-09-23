package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BillingAddressPage {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="input#BillingNewAddress_City")
	WebElement city;
	
	@FindBy(how=How.XPATH, using="input#BillingNewAddress_Address1")
	WebElement address1;
	
	@FindBy(how=How.XPATH, using="input#BillingNewAddress_Address2")
	WebElement address2;
	
	@FindBy(how=How.XPATH, using="input#BillingNewAddress_ZipPostalCode")
	WebElement ZipCode;
	
	@FindBy(how=How.XPATH, using="input#BillingNewAddress_PhoneNumber")
	WebElement phoneNumber;
	
	@FindBy(how=How.XPATH, using="input[onclick='Billing.save()']")
	WebElement continueButton;
	
	public BillingAddressPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void BillingAddress(String City, String addrs1, String addrs2, String PostalCode, String mobileNumber)
	{
		city.sendKeys(City);
		address1.sendKeys(addrs1);
		address2.sendKeys(addrs2);
		ZipCode.sendKeys(PostalCode);
		phoneNumber.sendKeys(mobileNumber);
		continueButton.click();
	}
}
