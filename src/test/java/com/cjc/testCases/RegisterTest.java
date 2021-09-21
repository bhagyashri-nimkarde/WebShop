package com.cjc.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.cjc.pages.RegisterPage;
import com.cjc.registerData.RegisterTestData;

import cjc.driver.Driver;

public class RegisterTest extends Driver {

	@Test
	public void RegisterMaleCustomer() {
		RegisterTestData RegTdata = new RegisterTestData();
		RegTdata.gender = "male";
		RegTdata.fname = "Sagar123";
		RegisterPage Rp = PageFactory.initElements(driver, RegisterPage.class);
		Rp.register(RegTdata);
	}

	@Test
	public void RegisterFemaleCustomer() {
		RegisterTestData RegTdata = new RegisterTestData();
		RegisterPage Rp = PageFactory.initElements(driver, RegisterPage.class);
		Rp.register(RegTdata);
	}

}