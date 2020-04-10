package com.promoapp.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.promoapp.qa.utils.TestUtil;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	//public  static EventFiringWebDriver e_driver;
    
	
	public TestBase() { //constructor
		try {
			prop= new Properties();
			FileInputStream ip= new FileInputStream("D:\\sunita\\promoappselenium\\src\\main\\java\\com\\promoapp\\qa\\config\\config.properties");
		prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

public static void initialization(){
	
	String browserName =prop.getProperty("browser");
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonu\\Downloads\\chromedriver.exe");
		driver =new ChromeDriver(); 
		driver.get(prop.getProperty("url"));
	}
//	else if(browserName.equals("ff")) {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sonu\\Downloads\\geckodriver.exe");
//		WebDriver driver =new FirefoxDriver(); //launch FF browser
//	}
//	
	driver.manage().window().maximize();  
	driver.manage().deleteAllCookies(); 
	
	
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	
	//driver.get(prop.getProperty("url"));
	
}

}

