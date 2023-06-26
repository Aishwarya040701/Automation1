package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestngAnnotations {
	public static WebDriver driver;
	
	@BeforeClass
	public void BrowserOpen() {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Before class");
			
	}
	
	@Test
	public void Url() {
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("Test");
	}
	
	@AfterClass
	public void BrowserClose(){
		driver.close();
		System.out.println("After class");
	}
	
	

}
