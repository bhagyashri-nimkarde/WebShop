package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NotebookPage {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//input[@value='Add to cart']")
	WebElement AddToCart;
	
	@FindBy(how=How.LINK_TEXT,using="Shopping cart")
	WebElement ShoppingCartLink;
	
	public NotebookPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void Go_to_NotebookPage()
	{
		AddToCart.click();
		ShoppingCartLink.click();
	}

}
