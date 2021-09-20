package com.cjc.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class RegisterPage {
	WebDriver driver;
	public void register()
	{
		driver.findElements(By.xpath("//a[@href='/register']")).click();
		
	}
	}

