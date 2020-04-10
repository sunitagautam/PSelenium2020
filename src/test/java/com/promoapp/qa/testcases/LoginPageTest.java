package com.promoapp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.promoapp.qa.pages.HomePage;
import com.promoapp.qa.pages.LoginPage;
import com.promoapp.qa.Base.TestBase;

public class LoginPageTest extends TestBase {
	
	 LoginPage login;
	  HomePage homepage;
	 public LoginPageTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		login = new LoginPage();
		homepage=new HomePage();
	}
	
	@Test(priority=1)
	public void loginageTitleTest() {
	String title=login.validateloginpagetitle();
	Assert.assertEquals(title, "Promo App");
		
	}
	
	@Test(priority=2)
	public void promoapplogo() {
		boolean flag =login.validatePromoapplogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void logintest() {
	homepage = login.loginn(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
