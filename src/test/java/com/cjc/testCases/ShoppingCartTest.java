package com.cjc.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import cjc.driverTest.BaseTest;

public class ShoppingCartTest extends BaseTest {
	@Test
	public void shoppingCart_should_be_successfully_checkout()
	{
		Lp.login("bhagyashrinimkarde@gmail.com", "Poonam@12");
		computerPage.Go_to_computerPge();
		notebookPage.AddNotebookToCart();
		shopingCart.Checkout("411028");
	}

}
