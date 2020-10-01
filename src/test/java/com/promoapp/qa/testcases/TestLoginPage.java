package com.promoapp.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.promoapp.qa.generics.BaseTest;
import com.promoapp.qa.generics.FWUtils;
import com.promoapp.qa.pages.HomePage;
import com.promoapp.qa.pages.LoginPage;
import com.google.common.annotations.VisibleForTesting;
public class TestLoginPage extends BaseTest{
	
    @Test
	public void login_Test()throws InterruptedException 
	{	int rowcount = FWUtils.read_XL_RowCount(READ_XL_DATA,"InvalidLoginPage");
	
	LoginPage lp =new LoginPage();
	
	for(int i=1; i<=rowcount;i++)
	{
		String un = FWUtils.read_XL_Data(READ_XL_DATA,"InvalidLoginPage",i,0);
		String pw = FWUtils.read_XL_Data(READ_XL_DATA,"InvalidLoginPage",i,1);
		lp.setUsername(un);
		lp.setPassword(pw);
		lp.clickOnLoginBTN();
		Thread.sleep(500);
		//lp.verifyErrMSg(driver);
		
	}
	
}
	

}
