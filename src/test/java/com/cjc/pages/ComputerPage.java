package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ComputerPage {
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using ="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	WebElement ComputersLink;
	
	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[2]/a")
	WebElement NotebookLink;
	
	public ComputerPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void Go_to_computerPge()
	{
		ComputersLink.click();
		
		NotebookLink.click();
	}

}
