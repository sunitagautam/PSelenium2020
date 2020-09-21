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

public class TestValidLoginPage extends BaseTest{
	
    @Test
	public void validlogin_Test()
	{	
		String un = FWUtils.read_XL_Data(READ_XL_DATA,"ValidLoginPage",1,0);
		String pw = FWUtils.read_XL_Data(READ_XL_DATA,"ValidLoginPage",1,1);
		String expectedTitleETP = FWUtils.read_XL_Data(READ_XL_DATA,"ValidLoginPage",1,2);
		
		

	}

}
