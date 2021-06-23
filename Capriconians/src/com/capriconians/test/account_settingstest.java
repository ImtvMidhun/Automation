package com.capriconians.test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capriconians.base.baseclass;
import com.capriconians.pages.Profile;
import com.capriconians.pages.account_settings;
import com.capriconians.pages.signup;
import com.capriconians.utility.testutil;

public class account_settingstest extends baseclass {
	
	String sheetnames="changepassword";
	String data2[][];
	account_settings obj;
	Profile obj2;

	@BeforeMethod
	public void objects() {
		
		browseropen("chrome");
		obj=new account_settings();
		obj2=new Profile();

	}

	@DataProvider
	public String[][] getdata3() throws IOException {
	
		data2=testutil.gettestdata(sheetnames,1,8);
		return data2;
	}
	
	@Test(dataProvider="getdata3",priority = 2,enabled=true)
	
	public void accountsettings(String currentpassword,String basicpassword,String newpassword,String policymessage,String oldpasswordmessage,String newpasswordmessage,String passwordmatch,String username) throws InterruptedException {
	
		obj2.login(username, currentpassword);	
		obj.changepassword(currentpassword, basicpassword, newpassword, policymessage, oldpasswordmessage, newpasswordmessage, passwordmatch);
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
}


