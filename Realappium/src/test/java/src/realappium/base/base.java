package src.realappium.base;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class base {
	
	
	public static AndroidDriver<AndroidElement> driver = null;
	
	
	public static void open() throws MalformedURLException {
		
		 DesiredCapabilities cap=new DesiredCapabilities();
		 cap.setCapability("deviceName", "oneplus 7 pro");
		 cap.setCapability("udid", "6ac662bb");
		 cap.setCapability("platformName", "Android");
		 cap.setCapability("platformVersion", "11");
		 cap.setCapability("appPackage", "com.consally");
		 cap.setCapability("appActivity", "com.consally.MainActivity");
		 cap.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		 
		 URL url=new URL("http://127.0.0.1:4723/wd/hub");
		 
		 driver=new AndroidDriver<AndroidElement>(url,cap); 
	}
	

}
