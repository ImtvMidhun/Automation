package com.capriconians.pages;

import org.apache.commons.math3.stat.inference.TestUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.capriconians.base.baseclass;
import com.capriconians.utility.testutil;

public class activities extends baseclass {
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/label[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement search;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	WebElement selectuser;
	
	@FindBy(xpath="//span[contains(text(),'Settings')]")
	WebElement settings;
	
	@FindBy(xpath="//div[contains(text(),'Manage Company Page')]")
	WebElement managecompany;
	
	@FindBy(xpath="//div[contains(text(),'Manage Admins')]")
	WebElement manageadmin;
	
	@FindBy(xpath="//i[contains(text(),'add')]")
	WebElement plusbutton;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement searchname;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]")
	WebElement select;
	
	@FindBy(xpath="/html/body/div[2]/div[6]/div/div/div/div")
	WebElement successmessage;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/a[1]/span[2]/span[1]/span[1]")
	WebElement accountuser;
	
	@FindBy(xpath="//header/div[1]/div[3]/button[5]/span[2]/span[1]/div[1]/div[1]/img[1]")
	WebElement accountmenu;
	
	@FindBy(xpath="//div[contains(text(),'Sign out')]")
	WebElement signout;
	
	@FindBy(xpath="//span[contains(text(),'Edit Profile')]")
	WebElement editprofile;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/form[1]/div[2]/div[2]/label[1]/div[1]/div[1]/div[1]/textarea[1]")
	WebElement aboutcompany;
	
	@FindBy(xpath="//span[contains(text(),'Publish')]")
	WebElement publish;
	
	@FindBy(xpath="//div[contains(text(),'Edit Company Profile Cover')]")
	WebElement editprofilecover;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[3]/button[1]/span[2]/span[1]/img[1]")
	WebElement deleteimage;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement save;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]")
	WebElement clickimage;
	
	@FindBy(xpath="//div[contains(text(),'Avatar')]")
	WebElement avatartab;
	
	@FindBy(xpath="//input[@id='okta-signin-username']")
	WebElement loginusername;
	
	@FindBy(xpath="//input[@id='okta-signin-password']")
	WebElement loginpassword;
	
	@FindBy(xpath="//input[@id='okta-signin-submit']")
	WebElement loginsubmit;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/div/img")
	WebElement selectcompany;
	
	
	
	
	
	
	public activities() {

		PageFactory.initElements(driver, this);
	}

	public void companyadmin(String username,String password,String name,String datamessage,String companyname) throws InterruptedException {
		
		testutil.explicit(accountmenu);
		accountmenu.click();
		testutil.explicit(settings);
		testutil.javascriptclick(settings);
		testutil.explicit(managecompany);
		managecompany.click();
		testutil.explicit(manageadmin);
		manageadmin.click();
		testutil.explicit(plusbutton);
		plusbutton.click();
		Thread.sleep(2000);
		testutil.explicit(searchname);
		searchname.sendKeys(name);
		Thread.sleep(2000);
		testutil.explicit(select);
		testutil.javascriptclick(select);
		testutil.explicit(successmessage);
		String message=successmessage.getText();
		Assert.assertEquals(datamessage,message);
		testutil.explicit(accountmenu);
		accountmenu.click();
		testutil.explicit(accountuser);
		accountuser.click();
		testutil.explicit(settings);
		settings.click();
		testutil.explicit(signout);
		signout.click();
		
		testutil.explicit(loginusername);
		loginusername.clear();
		loginpassword.clear();
		loginusername.sendKeys(username);
		testutil.explicit(loginpassword);
		loginpassword.sendKeys(password);
		testutil.explicit(loginsubmit);
		loginsubmit.click();
		
		testutil.explicit(search);
		search.sendKeys(companyname);
		search.sendKeys(Keys.ENTER);
		testutil.explicit(selectuser);
		selectuser.click();
		Thread.sleep(3000);
		testutil.explicit(selectcompany);
		testutil.javascriptclick(selectcompany);
		testutil.explicit(editprofile);
		editprofile.click();
		testutil.explicit(clickimage);
		Thread.sleep(1000);
		testutil.scrolldown(aboutcompany);
		testutil.explicit(aboutcompany);
		aboutcompany.sendKeys("Updated company details");
		Thread.sleep(1000);
		testutil.scrolldown(publish);
		publish.click();
		testutil.explicit(settings);
		settings.click();
		testutil.explicit(editprofilecover);
		editprofilecover.click();
		Thread.sleep(2000);
		testutil.scrolldown(deleteimage);
		testutil.explicit(deleteimage);
		deleteimage.click();
		testutil.explicit(save);
		save.click();
		Thread.sleep(4000);
		testutil.explicit(clickimage);
		clickimage.click();
		testutil.explicit(avatartab);
		testutil.javascriptclick(avatartab);
		Thread.sleep(2000);
		testutil.scrolldown(deleteimage);
		testutil.explicit(deleteimage);
		deleteimage.click();
		testutil.explicit(save);
		save.click();
		testutil.explicit(clickimage);
		testutil.scrolldown(publish);
		publish.click();
		
	}
	public void login(String username,String password) {
		
		testutil.explicit(loginusername);
		loginusername.clear();
		loginpassword.clear();
		loginusername.sendKeys(username);
		testutil.explicit(loginpassword);
		loginpassword.sendKeys(password);
		testutil.explicit(loginsubmit);
		loginsubmit.click();
		
		
	}
}
