package com.capriconians.pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.capriconians.base.baseclass;
import com.capriconians.utility.testutil;

public class signup extends baseclass{
	
	@FindBy(xpath="//a[@class='registration-link']")
	WebElement signupdata;
	
	@FindBy(xpath="//input[@id='input11']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input13']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='input15']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='input17']")
	WebElement lastname;
	

	@FindBy(xpath="//input[@class='button button-primary']")
	WebElement signupbuttun;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement yopmailvalue;
	
	@FindBy(xpath="//input[@class='sbut']")
	WebElement checkmail;
	
	@FindBy(xpath="//span[contains(text(),'Activate Account')]")
	WebElement clickmail;
	
	
	@FindBy(xpath="//header/div[1]/div[3]/button[5]/span[2]/span[1]/div[1]/div[1]/img[1]")
	WebElement accountmenu;
	
	@FindBy(xpath="//span[contains(text(),'Settings')]")
	WebElement settings;
	
	@FindBy(xpath="//div[contains(text(),'Account Settings')]")
	WebElement acsettings;
	
	@FindBy(xpath="//span[contains(text(),'Logout')]")
	WebElement logout;
	
	
	@FindBy(xpath="//div[@class='okta-form-infobox-error infobox infobox-error']/p")
	WebElement errormessage1;
	
	@FindBy(xpath="//div[@class='subschema-0 subschema-error subschema-unsatisfied']//p[1]")
	WebElement passwordmsg1;
	
	@FindBy(xpath="//div[@class='subschema-1 subschema-error subschema-unsatisfied']//p[1]")
	WebElement passwordmsg2;
	
	@FindBy(xpath="//div[@class='subschema-3 subschema-error subschema-unsatisfied']//p[1]")
	WebElement passwordmsg3;
	
	@FindBy(xpath="//a[@class='link help']")
	WebElement backtosignin;
	
	
	@FindBy(xpath="//a[@class='link help js-help']")
	WebElement helplink;
	
	@FindBy(xpath="//a[contains(text(),'Forgot password?')]")
	WebElement forgotpassword;
	
	@FindBy(xpath="//input[@id='account-recovery-username']")
	WebElement enteremail;
	
	@FindBy(xpath="//a[@class='button button-primary button-wide email-button link-button']")
	WebElement resetbutton;
	
	@FindBy(xpath="//input[@id='input4']")
	WebElement newpassword;
	
	@FindBy(xpath="//input[@id='input6']")
	WebElement repeatpassword;
	
	@FindBy(xpath="//input[@class='button button-primary']")
	WebElement clickreset;
	
	@FindBy(xpath="//a[contains(@class,'link-button')]")
	WebElement linkedlnsignin;
	
	@FindBy(xpath="//a[contains(text(),'Cancel')]")
	WebElement cancel;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement linkbutton;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement linkusername;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement linkpassword;
	
	@FindBy(xpath="//input[@id='okta-signin-username']")
	WebElement loginusername;
	
	@FindBy(xpath="//input[@id='okta-signin-password']")
	WebElement loginpassword;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/p[1]")
	WebElement errorclass1;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/p[1]")
	WebElement errorclass2;
	
	@FindBy(xpath="//input[@id='okta-signin-submit']")
	WebElement loginsubmit;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/p[1]")
	WebElement invaliderror;
	
	@FindBy(xpath="//i[contains(text(),'close')]")
	WebElement popupclose;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[3]/button[1]/span[2]/span/span")
	WebElement cancelbutton;
	
	@FindBy(xpath="//*[@id=\"ifmail\"]")
	WebElement iframe;
	
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[2]/div[1]/a[1]/span[2]/span[1]/span[1]")
	WebElement accountpopup;
	
	@FindBy(xpath="//span[contains(text(),'Start')]")
	WebElement start;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement select;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement next;
	
	@FindBy(xpath="//span[contains(text(),'Done')]")
	WebElement done;
	
	@FindBy(xpath="//div[contains(text(),'Sign out')]")
	WebElement signout;
	
	@FindBy(xpath="//span[contains(text(),'Enter Now Consally')]")
	WebElement enter;
	
	
	
	
	

	
	
	public signup() {

		PageFactory.initElements(driver, this);
	}
	
	
	public void signupuser(String emaildata,String passworddata,String firstnamedata,String lastnamedata) throws InterruptedException {
		
		testutil.explicit(signupdata);
	    testutil.javascriptclick(signupdata);
		testutil.explicit(email);
		email.sendKeys(emaildata);
		testutil.explicit(password);
		password.sendKeys(passworddata);
		testutil.explicit(firstname);
		firstname.sendKeys(firstnamedata);
		testutil.explicit(lastname);
		lastname.sendKeys(lastnamedata);
		testutil.explicit(signupbuttun);
		testutil.javascriptclick(signupbuttun);
		
	}
		
	public void yopmailclick(String emaildata,String activate_reset,int window) throws InterruptedException {
		
		driver.navigate().to("http://www.yopmail.com/en/");
		testutil.explicit(yopmailvalue);
		yopmailvalue.clear();
		yopmailvalue.sendKeys(emaildata);
		Thread.sleep(1000);
		testutil.explicit(checkmail);
		checkmail.click();
		Thread.sleep(3000);
		testutil.explicit(iframe);
		driver.switchTo().frame("ifmail");
		WebElement activateaccount=driver.findElement(By.xpath("//span[contains(text(),'"+activate_reset+"')]"));
		testutil.explicit(activateaccount);
		testutil.javascriptclick(activateaccount);
		
		for(String winHandle : driver.getWindowHandles()){

				driver.switchTo().window(winHandle);
	
		}
		
	}
		
	public void onboarding(String companynamedata,String locationdata,String jobtitledata) throws InterruptedException {
		
			//Thread.sleep(15000);
			testutil.explicit(start);
			testutil.javascriptclick(start);
			testutil.explicit(select);
			select.click();
			
			Thread.sleep(500);
			WebElement companynamename=driver.findElement(By.xpath("//div[contains(text(),'"+companynamedata+"')]"));	
			companynamename.click();
			next.click();
			
			testutil.explicit(select);
			Thread.sleep(500);
			select.sendKeys(locationdata);
			Actions builder = new Actions(driver);        
			builder.sendKeys(Keys.ENTER);
			
			next.click();
			testutil.explicit(select);
			Thread.sleep(500);
			testutil.javascriptclick(select);
			Thread.sleep(500);
			WebElement jobname=driver.findElement(By.xpath("//div[contains(text(),'"+jobtitledata+"')]"));
			jobname.click();
			done.click();
			
			testutil.explicit(enter);
			enter.click();
			
			Thread.sleep(3000);
			testutil.explicit(accountmenu);
			testutil.javascriptclick(accountmenu);
			
			
			
			
			/*System.out.println("inside 3");
			testutil.explicit(settings);
			testutil.javascriptclick(settings);
			testutil.explicit(signout);
			testutil.javascriptclick(signout);*/
		
	}
	
	public void logout() throws InterruptedException {
		

		System.out.println("inside 1");
		testutil.explicit(accountmenu);
		accountmenu.click();
		System.out.println("inside 2");
		
		testutil.explicit(settings);
		testutil.javascriptclick(settings);
		testutil.explicit(signout);
		testutil.javascriptclick(signout);
}
	
	public void logoutafterlinkedln() throws InterruptedException {
		

		System.out.println("another 1");
		testutil.explicit(accountmenu);
		testutil.javascriptclick(accountmenu);
		System.out.println("another 2");
		//testutil.explicit(accountpopup);
		//accountpopup.click();
		
		System.out.println("another 3");
		testutil.explicit(settings);
		testutil.javascriptclick(settings);
		testutil.explicit(signout);
		testutil.javascriptclick(signout);
}
	
	
	public void signupvalidations(String emailduplicate,String invalidpassword,String message1,String message2,String message3) throws InterruptedException {
		
		testutil.explicit(errormessage1);
		Assert.assertEquals(emailduplicate,errormessage1.getText());
		testutil.explicit(password);
		password.clear();
		password.sendKeys(invalidpassword);
		Thread.sleep(1000);
		
		System.out.println(passwordmsg1.getText());
		System.out.println(passwordmsg2.getText());	
		System.out.println(passwordmsg3.getText());	
		Assert.assertEquals(message1,passwordmsg1.getText());
		Assert.assertEquals(message2,passwordmsg2.getText());
		Assert.assertEquals(message3,passwordmsg3.getText());
		
	}
	
	public void forgotpassword(String emaildata) throws InterruptedException {
		

		testutil.explicit(forgotpassword);
		
		testutil.javascriptclick(forgotpassword);
		testutil.explicit(enteremail);
		enteremail.sendKeys(emaildata);
		testutil.explicit(resetbutton);
		testutil.javascriptclick(resetbutton);
		Thread.sleep(1000);
		
		driver.navigate().to("http://www.yopmail.com/en/");
		
	}
	
	public void resetnewpassword(String newpassworddata) throws InterruptedException {
		
		Thread.sleep(1000);						
		testutil.explicit(newpassword);
		newpassword.sendKeys(newpassworddata);
	
		testutil.explicit(repeatpassword);
		repeatpassword.sendKeys(newpassworddata);
		testutil.explicit(clickreset);
		testutil.javascriptclick(clickreset);
		}
	
	
	public void signinlinkedln(String username,String password) throws InterruptedException {
		
		/*testutil.explicit(linkedlnsignin);
		testutil.javascriptclick(linkedlnsignin);
		testutil.explicit(cancel);
		testutil.javascriptclick(cancel);
		Thread.sleep(3000);*/
		testutil.explicit(linkedlnsignin);
		testutil.javascriptclick(linkedlnsignin);
		testutil.explicit(linkusername);
		linkusername.sendKeys(username);
		testutil.explicit(linkpassword);
		linkpassword.sendKeys(password);
		testutil.explicit(linkbutton);
		testutil.javascriptclick(linkbutton);
		
		
	}
	
	public void loginwithvalidation(String username,String password,String invalidpassword,String message1,String message2,String message3) throws InterruptedException {
		
		testutil.explicit(loginusername);
		loginusername.clear();
		loginpassword.clear();
		testutil.explicit(loginsubmit);
		loginsubmit.click();
		Thread.sleep(1000);
		Assert.assertEquals(message1, errorclass1.getText());
		Assert.assertEquals(message2, errorclass2.getText());
		loginusername.sendKeys(username);
		loginpassword.sendKeys(invalidpassword);
		testutil.explicit(loginsubmit);
		testutil.javascriptclick(loginsubmit);
		testutil.explicit(invaliderror);
		Assert.assertEquals(message3, invaliderror.getText());
		loginpassword.clear();
		//driver.get("dev.consally.com");
		//testutil.explicit(loginusername);
		//loginusername.sendKeys(username);
		loginpassword.sendKeys(password);
		testutil.explicit(loginsubmit);
		testutil.javascriptclick(loginsubmit);
	}
	

}



