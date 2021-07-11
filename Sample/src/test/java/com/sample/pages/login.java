package com.sample.pages;

import java.applet.AppletStub;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sample.base.base;
import com.sample.testutil.testutil;

public class login extends base{
	
	
	
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement username1;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password1;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")
	WebElement submit;
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement close;
	
	
	
	
	
	
	
	
	
	public login() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void logindata(String username,String password) throws InterruptedException, IOException {
		
		
		//testutil.callwait(login);
		//Thread.sleep(3000);
		testutil.callwait(username1);
		username1.sendKeys(username);
		testutil.callwait(password1);
		password1.sendKeys(password);
		testutil.callwait(submit);
		submit.click();
		
		testutil.screenshot("store");

 

	
	}
	
	public void second() throws IOException, InterruptedException, AWTException {
		
		
		
		testutil.callwait(close);
		close.click();
		
	
		Actions act=new Actions(driver);
		
		act.moveToElement(login).perform();
		Thread.sleep(3000);
		act.contextClick(login).perform();
		act.sendKeys(Keys.ENTER);
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		
	}

}
