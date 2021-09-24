package cjc.driverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cjc.pages.ComputerPage;
import com.cjc.pages.LoginPage;
import com.cjc.pages.NotebookPage;
import com.cjc.pages.RegisterPage;
import com.cjc.pages.ShoppingCartPage;
import com.cjc.registerData.RegisterTestData;

public class BaseTest{
	public WebDriver driver;
	public RegisterTestData RegTdata;
	public RegisterPage Rp;
	public LoginPage Lp;
	public ShoppingCartPage shopingCart;
	public ComputerPage computerPage;
	public NotebookPage notebookPage;

	@BeforeMethod
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		
		RegTdata = new RegisterTestData();
		
		Rp = PageFactory.initElements(driver, RegisterPage.class);
		Lp=PageFactory.initElements(driver, LoginPage.class);
		shopingCart=PageFactory.initElements(driver, ShoppingCartPage.class);
		computerPage=PageFactory.initElements(driver, ComputerPage.class);
		notebookPage=PageFactory.initElements(driver, NotebookPage.class);

	}

	@AfterMethod
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}
