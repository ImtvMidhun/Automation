package src.mobileapp.base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import src.mobileapp.utility.testutil;

public class base {
	
		@AndroidFindBy(xpath="//*[@text='Consally']")
		static AndroidElement openapp;
		
		  public static String reportDirectory = "reports";
		  public static String reportFormat = "xml";
		  public static String testName = "Untitled";
		  public static AndroidDriver<AndroidElement> driver = null;

	   static DesiredCapabilities dc = new DesiredCapabilities();
	    

	    public static void setUp() throws MalformedURLException {
	    	
	        dc.setCapability("reportDirectory", reportDirectory);
	        dc.setCapability("reportFormat", reportFormat);
	        dc.setCapability("testName", testName);
	        dc.setCapability(MobileCapabilityType.UDID, "6ac662bb");
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);
	        
	    }
	    
	    public static void open() {
	    	
	    	testutil.explicit(openapp);
	    	openapp.click();
	    }
	    
}
