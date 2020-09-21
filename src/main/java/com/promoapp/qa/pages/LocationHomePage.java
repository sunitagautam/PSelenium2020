package com.promoapp.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.promoapp.qa.generics.BaseTest;

public class LocationHomePage extends BaseTest {
	
	//Page factory
	  @FindBy(xpath="//img[@class='img-responsive header-logo pa-cursor-pointer']")
	static WebElement Promologo;
	  
	  @FindBy(xpath="//a[@class='pa-color-333333 pa-font-16 pa-font-wt-500 pa-font-Lato pa-no-padding pa-no-margin md-button md-ink-ripple pa-heading-selected']")
	static WebElement browseEventlink;
		
	  @FindBy(linkText="Search")
	static WebElement searchlink;
	  
	  @FindBy(xpath="//button[@class='pa-add-event pa-font-14 new-create-btn']")
	  WebElement CreateButton;
			
	
	 @FindBy(xpath="//a[@class='pa-color-pink pa-login-button-header pa-font-14 pa-font-wt-500 md-button md-ink-ripple']")
	 static WebElement Headerloginbtn;
		
		@FindBy(xpath="//input[@id='input_0']")
		WebElement searchLocation;
		
		@FindBy(xpath="//div/div/md-icon[@class='material-icons tt-mr-10 pa-cursor-pointer']")
		WebElement mylocationIcon;
		
		@FindBy(xpath="//div/div/span[@class='pa-bold-font tt-font-16 pa-lh-3 pa-vertical-align pa-cursor-pointer ']")
		WebElement useMyCurrentLocation;
		
		@FindBy(xpath="//button[@class='pa-border-4 h-48 w-270 pa-pink-button pa-bold-font pa-mt-16 md-button md-ink-ripple' ]")
		WebElement LocationBlockedBtn;
	
		// Intializing the Page Objects
		
		public LocationHomePage() {  //constructor
			PageFactory.initElements(driver,this);
		}
		public static boolean validateURLlogoClick (WebDriver driver, String expURL) {
			Promologo.click();
			boolean result=false;
			if(driver.getCurrentUrl().equalsIgnoreCase(expURL)){
				result=true;
				
			}
			return result;
		}
		
		public static boolean validateURLBrowseEventLinkClick (WebDriver driver, String expURL) {
			browseEventlink.click();
			boolean result=false;
			if(driver.getCurrentUrl().equalsIgnoreCase(expURL)){
				result=true;
				
			}
			return result;
		}
		
		public static boolean validateURLSearchClick (WebDriver driver, String expURL) {
			searchlink.click();
			boolean result=false;
			if(driver.getCurrentUrl().equalsIgnoreCase(expURL)){
				result=true;	
			}
			return result;
		}
		
		public static boolean validateURLloginbtnClick (WebDriver driver, String expURL) {
			Headerloginbtn.click();
			boolean result=false;
			if(driver.getCurrentUrl().equalsIgnoreCase(expURL)){
				result=true;	
			}
			return result;
		}
		public void alertwindowlocation() throws InterruptedException {
			useMyCurrentLocation.click();
			Thread.sleep(3000);
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			String text =alert.getText();
			
			if(text.equals("Location Access Blocked")) {
				System.out.println("correct alert message");
			}
			else {
				System.out.println("Incorrect alert message");
			}
			
			alert.accept();
			
		}
		
		
		public void alertwindow() throws InterruptedException {
			CreateButton.click();
			Thread.sleep(3000);
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			String text =alert.getText();
			
			if(text.equals("You must login and sign up to continue")) {
				System.out.println("correct alert message");
			}
			else {
				System.out.println("Incorrect alert message");
			}
			LocationBlockedBtn.click();
			//alert.dismiss();
			
		}
		
}

