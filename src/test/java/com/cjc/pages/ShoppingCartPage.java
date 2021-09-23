package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCartPage {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="select[id='CountryId']> option:nth-child(99)")
	WebElement selectCountry;
	
	@FindBy(how=How.XPATH, using="select[name='StateProvinceId']>option[value='0']")
	WebElement selectState;
	
	@FindBy(how=How.XPATH, using="input[id='ZipPostalCode']")
	WebElement zipcode;
	
	@FindBy(how=How.XPATH, using="input[name='estimateshipping']")
	WebElement estimateShipping;
	
	@FindBy(how=How.XPATH, using="input[name='termsofservice']")
	WebElement termsofservice;
	
	@FindBy(how=How.XPATH, using="button[name='checkout']")
	WebElement checkoutButton;
	
	public ShoppingCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void ShoppingCart(String postalcode)
	{
		selectCountry.click();
		selectState.click();
		zipcode.sendKeys(postalcode);
		estimateShipping.click();
		termsofservice.click();
		checkoutButton.click();
	}


	}
