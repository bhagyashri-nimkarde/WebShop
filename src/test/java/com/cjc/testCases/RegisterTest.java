package com.cjc.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cjc.driverTest.BaseTest;

public class RegisterTest extends BaseTest {

	@Test
	public void RegisterMaleCustomer() {

		RegTdata.gender = "male";
		RegTdata.fname = "Sagar123";

		Rp.register(RegTdata);
	}

	@Test
	public void RegisterFemaleCustomer() {
		Rp.register(RegTdata);
	}

	@DataProvider(name = "FirstNameValidations")
	public Object[][] FirstNameData() {
		return new Object[][] { { "sagar nimkarde" }, { "sagarnimkarde111" }, { "" } };
	}

	@Test(dataProvider = "FirstNameValidations")
	public void firstnameOfCustomer(String firstName) {
		RegTdata.fname = firstName;
		Rp.register(RegTdata);
	}

	@DataProvider(name = "LastNameValidations")
	public Object[][] LastNameData() {
		return new Object[][] { { "sagar nimkarde" }, { "sagarnimkarde111" }, { "" }, { "sagar@1234" } };
	}

	@Test(dataProvider = "LastNameValidations")
	public void lastnameOfCustomer(String lastname) {

		RegTdata.lname = lastname;
		Rp.register(RegTdata);
	}

	@DataProvider(name = "emailValidation")
	public Object[][] EmailData() {
		return new Object[][] { { "bhagyashrinim@gmailcom" }, { "bhagyashrinimgmail.com" } };
	}

	@Test(dataProvider = "emailValidation")
	public void emailOfCustomer(String email) {

		RegTdata.email = email;
		Rp.register(RegTdata);
	}

	@DataProvider(name = "passwordValidation")
	public Object[][] passwordData() {
		return new Object[][] { { "qwerty" }, { "qwerty1234" }, { "Qwerty@#" } };
	}

	@Test(dataProvider = "passwordValidation")
	public void password(String password) {

		RegTdata.pwd = password;
		Rp.register(RegTdata);
	}

	@Test
	public void ConfirmPassword() {

		RegTdata.cpd = "sagarNim456";
		Rp.register(RegTdata);
	}
}