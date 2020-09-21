package com.promoapp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.promoapp.qa.generics.BaseTest;
import com.promoapp.qa.pages.HomePage;

public class LoginPage extends BaseTest {

	//Page factory
	@FindBy(xpath="//a[@class='pa-color-pink pa-login-button-header pa-font-14 pa-font-wt-500 md-button md-ink-ripple']")
	WebElement Headerloginbtn;
	
	@FindBy(name="userName")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath= "//a[@class='create-account login']")
	WebElement signuplink;
	
	@FindBy(xpath="//img[@class='img-responsive header-logo pa-cursor-pointer']")
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
	
	public void clickOnloginButton(){
		Actions action = new Actions(driver);
		action.moveToElement(Headerloginbtn).build().perform();
		
	}

	public HomePage loginn(String un, String pw) {
		Headerloginbtn.click();
		username.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		return new HomePage();
	}


}
