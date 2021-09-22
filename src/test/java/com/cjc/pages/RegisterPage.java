package com.cjc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.cjc.registerData.RegisterTestData;

public class RegisterPage {
	WebDriver driver;
	@FindBy(how = How.LINK_TEXT, using = "Register")
	WebElement reglinkButton;

	@FindBy(how = How.ID, using = "gender-female")
	WebElement fgender;
	@FindBy(how = How.ID, using = "gender-male")
	WebElement mgender;

	@FindBy(how = How.ID, using = "FirstName")
	WebElement firstname;

	@FindBy(how = How.ID, using = "LastName")
	WebElement lastname;

	@FindBy(how = How.ID, using = "Email")
	WebElement email;
	@FindBy(how = How.ID, using = "Password")
	WebElement pswd;

	@FindBy(how = How.ID, using = "ConfirmPassword")
	WebElement cpwd;

	@FindBy(how = How.ID, using = "register-button")
	WebElement registerB;
	
	

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void register(RegisterTestData RegTdata) {
		reglinkButton.click();
		if (RegTdata.gender == "female") {
			fgender.click();
		} else {
			mgender.click();
		}
		firstname.sendKeys(RegTdata.fname);
		lastname.sendKeys(RegTdata.lname);
		email.sendKeys(RegTdata.email);
		pswd.sendKeys(RegTdata.pwd);
		cpwd.sendKeys(RegTdata.cpd);
		registerB.click();
	}
}
