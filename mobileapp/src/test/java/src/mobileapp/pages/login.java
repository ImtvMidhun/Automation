package src.mobileapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import src.mobileapp.base.base;
import src.mobileapp.utility.testutil;

public class login extends base {
	
	
	@AndroidFindBy(xpath="//*[@text='Sign in']")
	AndroidElement signin;
	
	@AndroidFindBy(xpath="//*[@name='username']")
	AndroidElement username;
	
	@AndroidFindBy(xpath="//*[@name='password']")
	AndroidElement password;
	
	@AndroidFindBy(xpath="//*[@value='Sign In']")
	AndroidElement sign;
	
	@AndroidFindBy(xpath="//*[@text='Consally']")
	AndroidElement openapp;
	
	
	
	public login() {

		

		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}


	public void logindata(String username1,String password1) throws InterruptedException {
	
	
	testutil.explicit(signin);
	signin.click();
	driver.context("WEBVIEW_1");
	testutil.explicit(username);
	username.sendKeys(username1);
	testutil.explicit(password);
	password.sendKeys(password1);
	Thread.sleep(2000);
	driver.findElement(By.id("okta-signin-submit")).click();
	driver.context("NATIVE_APP");

}

}
