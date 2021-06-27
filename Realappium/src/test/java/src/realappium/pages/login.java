package src.realappium.pages;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import src.realappium.utility.testutil;

public class login extends src.realappium.base.base {
	
	
	@AndroidFindBy(xpath="//*[@text='Sign in']")
	AndroidElement signin;
	
	@FindBy(id="okta-signin-username")
	WebElement username;
	
	@FindBy(id="okta-signin-password")
	WebElement password;
	
	@FindBy(id="okta-signin-submit")
	WebElement sign;
	
	@AndroidFindBy(xpath="//*[@text='Consally']")
	AndroidElement openapp;
	
	
	
	public login() {

		

		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}


	public void logindata(String username1,String password1) throws InterruptedException {
	
	
	testutil.explicit(signin);
	signin.click();
	Thread.sleep(4000);
	driver.context("WEBVIEW_chrome");
	testutil.webexplicit(username);
	username.sendKeys(username1);
	testutil.webexplicit(password);
	password.sendKeys(password1);
	testutil.webexplicit(sign);
	sign.click();
	//Thread.sleep(2000);
	//driver.findElement(By.id("okta-signin-submit")).click();
	

}

}
