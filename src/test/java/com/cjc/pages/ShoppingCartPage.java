package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPage {
	WebDriver driver;
	
	@FindBy(how=How.CSS, using="select[id='CountryId']>option[value='41']")
	WebElement selectCountry;
	
	@FindBy(how=How.CSS, using="select[name='StateProvinceId']>option[value='0']")
	WebElement selectState;
	
	@FindBy(how=How.XPATH, using="//input[@id='ZipPostalCode']")
	WebElement zipcode;
	
	@FindBy(how=How.CSS, using="input[name='estimateshipping']")
	WebElement estimateShipping;
	
	@FindBy(how=How.CSS, using="input[name='termsofservice']")
	WebElement termsofservice;
	
	@FindBy(how=How.CSS, using="button[name='checkout']")
	public WebElement checkoutButton;
	
	@FindBy(how=How.LINK_TEXT,using="Shopping cart")
	WebElement ShoppingCartLink;
	
	public ShoppingCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Checkout(String postalcode)
	{
		ShoppingCartLink.click();
		selectCountry.click();
		selectState.click();
		zipcode.sendKeys(postalcode);
		estimateShipping.click();
		termsofservice.click();
		checkoutButton.click();
	}


	}
