package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Browser open
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		//Thread.sleep(7000);
//		
//		//driver.findElement(By.xpath("//button[@aria-label='No thanks'][@jsname='ZUkOIc']")).click();
//		
//		driver.findElement(By.id("APjFqb")).sendKeys("Chocolates");
//		driver.findElement(By.id("APjFqb")).click();
//		//driver.close();

		driver.get("https://www.facebook.com");
	}

}
