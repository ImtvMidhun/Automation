package com.capriconians.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
public static WebDriver driver;
static String arg1="D:\\apps\\geckodriver.exe";
static String arg2="D:\\apps\\selenium\\chromedriver.exe";
	
	public static void browseropen(String browser) {
		
		switch (browser) {
		
		case "chrome": 	System.setProperty("webdriver.chrome.driver", arg2);
						driver = new ChromeDriver();
			
						break;
			
		/*case "firefox":	System.setProperty("webdriver.gecko.driver",);
						driver = new FirefoxDriver();
						break;*/

		}
						driver.manage().window().maximize();
						driver.get("http://dev.consally.com/");
		
	}

}
