package com.cjc.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cjc.driverTest.BaseTest;

public class LoginTest extends BaseTest {
	
	@DataProvider(name = "EmailValidations")
	public Object[][] emaileData() {
		return new Object[][] { {""}, { "sagarnimkarde@gmailcom" }, { "sagarnimkardegmail.com" },{"sagarNimkarde@gmail.com"} };
	}

	@Test(dataProvider = "EmailValidations")
	public void loginShouldFailInCaseOf_WrongEmailId(String email) {
		Lp.login(email, "Poonam@123");
	}
	
	@DataProvider(name = "passwordValidation")
	public Object[][] passwordData() {
		return new Object[][] { { "qwerty" }, { "qwerty1234" }, { "Qwerty@#" } };
	}

	@Test(dataProvider = "passwordValidation")
	public void loginShouldFailInCaseOf_WrongPassword(String password) {

		Lp.login("BhagyashriNimkarde@gmail.com", password);
	}
	
	@Test
	public void loginShouldBe_Successful_InCaseOf_ValidEmail_password() {

		Lp.login("bhagyashri@gmail.com", "Poonam@12");
	}
	


}
