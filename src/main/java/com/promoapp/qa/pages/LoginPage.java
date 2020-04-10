package com.promoapp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.promoapp.qa.pages.HomePage;
import com.promoapp.qa.Base.TestBase;

public class LoginPage extends TestBase {

	//Page factory
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath= "//a[@class='create-account login']")
	WebElement signuplink;
	
	@FindBy(xpath="//img[@class='img-responsive header-logo']")
	WebElement Promologo;
	
	// Intializing the Page Objects
	
	public LoginPage() {  //constructor
		PageFactory.initElements(driver,this);
	}
	
	public String validateloginpagetitle() {
		return driver.getTitle();
		
	}
	public boolean validatePromoapplogo() {
		return Promologo.isDisplayed();
	}
	public HomePage loginn(String user, String pwd) {
		username.sendKeys(user);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
	}

}
