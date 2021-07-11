package com.interview.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	
	public static WebDriver driver;
	static String location="D:\\apps\\selenium\\chromedriver.exe";
	
	public static void baseclass() {
		
		
		
		System.setProperty("webdriver.chrome.driver", location);
		driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		
	}

}
