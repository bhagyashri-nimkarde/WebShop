package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cjc.registerData.RegisterTestData;

public class LoginPage {
	WebDriver driver;
		@FindBy(how=How.LINK_TEXT, using ="Log in")
		WebElement logInLink;
		
		@FindBy(how=How.ID , using ="Email")
		WebElement email;
		
		@FindBy(how=How.ID , using ="Password")
		WebElement password;
		
		@FindBy(how=How.XPATH, using ="//input[@value='Log in']")
		WebElement LogInButton;
		
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void login(String emailId, String passwd)
	{
	logInLink.click();
	email.sendKeys(emailId);
	password.sendKeys(passwd);
	LogInButton.click();
	}
}
