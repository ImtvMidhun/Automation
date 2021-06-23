package com.capriconians.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.capriconians.base.baseclass;
import com.capriconians.utility.testutil;

public class account_settings extends baseclass {
	
	@FindBy(xpath="//header/div[1]/div[3]/button[5]/span[2]/span[1]/div[1]/div[1]/img[1]")
	WebElement accountmenu;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[3]/button[1]/span[2]/span/span")
	WebElement cancelbutton;
	
	@FindBy(xpath="//span[contains(text(),'Einstellungen') or contains(text(),'Settings')]")
	WebElement settings;
	
	@FindBy(xpath="//div[contains(text(),'Change Password')]/parent::div//label[1]/div/div/div[1]/input")
	WebElement oldpassword;
	
	@FindBy(xpath="//div[contains(text(),'Change Password')]/parent::div//label[2]/div/div/div[1]/input")
	WebElement newpassword;
	
	@FindBy(xpath="//div[contains(text(),'Change Password')]/parent::div//label[3]/div/div/div[1]/input")
	WebElement confirmnewpassword;
	
	@FindBy(xpath="//span[contains(text(),'Save Password')]")
	WebElement savepassword;
	
	@FindBy(xpath="//div[@class='q-field__messages col']/div")
	WebElement errormessage; 
	
	@FindBy(xpath="//div[@class='q-notification__message col']")
	WebElement popupmessage;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[3]/label[1]/div[1]/div[1]/div[2]/i[1]")
	WebElement eye;
	
	@FindBy(xpath="//span[contains(text(),'Logout') or contains(text(),'Ausloggen')]")
	WebElement logout;
	
	@FindBy(xpath="//div[contains(text(),'Change Password')]")
	WebElement changepassword;
	
	
	
	
	
	
	public account_settings() {
		

		PageFactory.initElements(driver, this);
	}
	
	public void changepassword(String currentpassword,String basicpassword,String newpassworddata,String policymessage,String oldpasswordmessage,String newpasswordmessage,String passwordmatch) throws InterruptedException {
		
		
		System.out.println("inside 6");
		testutil.explicit(accountmenu);
		accountmenu.click();
		/*testutil.explicit(cancelbutton);
		cancelbutton.click();*/
		testutil.explicit(settings);
		testutil.javascriptclick(settings);
		testutil.explicit(changepassword);
		changepassword.click();
		
		//basic password error message 
		testutil.explicit(oldpassword);
		oldpassword.sendKeys(currentpassword);
		testutil.explicit(newpassword);
		newpassword.sendKeys(basicpassword);
		testutil.explicit(confirmnewpassword);
		confirmnewpassword.sendKeys(basicpassword);
		eye.click();
		testutil.explicit(errormessage);
		Assert.assertEquals(policymessage, errormessage.getText());
		
		//old password error message
		
		newpassword.sendKeys(Keys.CONTROL + "a");
		newpassword.sendKeys(Keys.DELETE);
		newpassword.sendKeys(newpassworddata);
		confirmnewpassword.sendKeys(Keys.CONTROL + "a");
		confirmnewpassword.sendKeys(Keys.DELETE);
		confirmnewpassword.sendKeys(newpassworddata);
		oldpassword.sendKeys(Keys.CONTROL + "a");
		oldpassword.sendKeys(Keys.DELETE);
		oldpassword.sendKeys(basicpassword);
		testutil.explicit(savepassword);
		testutil.javascriptclick(savepassword);
		testutil.explicit(popupmessage);
		Assert.assertEquals(oldpasswordmessage, popupmessage.getText());
		
		//new password and confirm password not same error message	
		
		testutil.explicit(oldpassword);
		oldpassword.sendKeys(Keys.CONTROL + "a");
		oldpassword.sendKeys(Keys.DELETE);
		oldpassword.sendKeys(currentpassword);
		confirmnewpassword.sendKeys(Keys.CONTROL + "a");
		confirmnewpassword.sendKeys(Keys.DELETE);
		confirmnewpassword.sendKeys(basicpassword);
		testutil.explicit(errormessage);
		Assert.assertEquals(passwordmatch, errormessage.getText());
		
		//password changed 
		confirmnewpassword.sendKeys(Keys.CONTROL + "a");
		confirmnewpassword.sendKeys(Keys.DELETE);
		confirmnewpassword.sendKeys(newpassworddata);
		Thread.sleep(6000);
		testutil.explicit(savepassword);
		testutil.javascriptclick(savepassword);
		
		testutil.explicit(popupmessage);
		Assert.assertEquals(newpasswordmessage, popupmessage.getText());
		
		Thread.sleep(2000);
		testutil.scrolldown(logout);
		testutil.explicit(logout);
		logout.click();
		
	}

}
