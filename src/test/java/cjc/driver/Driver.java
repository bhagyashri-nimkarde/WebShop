package cjc.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Driver {
	public WebDriver driver;
	@BeforeTest
	public void getDriver()
		{
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		}
	
	}

