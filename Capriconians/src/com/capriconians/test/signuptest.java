package com.capriconians.test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capriconians.base.baseclass;
import com.capriconians.pages.signup;
import com.capriconians.utility.testutil;



public class signuptest extends baseclass{
	signup obj;
	String sheetnames="login";
	String data2[][];
	


	@BeforeMethod
	public void method() {
		
		browseropen("chrome");
		obj=new signup();
		
	}

	@DataProvider
	public String[][] getdata2() throws IOException {
	
		data2=testutil.gettestdata(sheetnames,1,20);
		return data2;
	}
	
	
	@Test(dataProvider="getdata2",priority=1,enabled=true)
	
	public void signup(String emaildata,String passworddata,String firstnamedata,String lastnamedata,String emailduplicate,String invalidpassword,String message1,String message2,String message3,String activateaccount,String resetpassword,String newpassword,String linkuser,String linkpass,String emessage1,String emessage2,String emessage3,String companynamedata,String locationdata,String jobtitledata) throws InterruptedException {
		
		obj.signupuser(emaildata,passworddata,firstnamedata,lastnamedata);
		obj.yopmailclick(emaildata,activateaccount,1);
		obj.onboarding(companynamedata,locationdata,jobtitledata);
		
		//obj.signinlinkedln(linkuser, linkpass);
		//obj.logoutafterlinkedln();
		
	}
	@Test(dataProvider="getdata2",priority=2,enabled=true)
	public void signupvalidations(String emaildata,String passworddata,String firstnamedata,String lastnamedata,String emailduplicate,String invalidpassword,String message1,String message2,String message3,String activateaccount,String resetpassword,String newpassword,String linkuser,String linkpass,String emessage1,String emessage2,String emessage3,String companynamedata,String locationdata,String jobtitledata) throws InterruptedException {
		

		obj.signupuser(emaildata,passworddata,firstnamedata,lastnamedata);
		obj.signupvalidations(emailduplicate, invalidpassword, message1, message2, message3);
	}

	@Test(dataProvider ="getdata2",priority=3,enabled=true)
	public void resetpassword(String emaildata,String passworddata,String firstnamedata,String lastnamedata,String emailduplicate,String invalidpassword,String message1,String message2,String message3,String activateaccount,String resetpassword,String newpassword,String linkuser,String linkpass,String emessage1,String emessage2,String emessage3,String companynamedata,String locationdata,String jobtitledata) throws InterruptedException {
		
		obj.forgotpassword(emaildata);
		obj.yopmailclick(emaildata,resetpassword,2);
		obj.resetnewpassword(newpassword);
		obj.logout();	
	}
	@Test(dataProvider ="getdata2",priority=4,enabled=true)
	public void loginvalidation(String emaildata,String passworddata,String firstnamedata,String lastnamedata,String emailduplicate,String invalidpassword,String message1,String message2,String message3,String activateaccount,String resetpassword,String newpassword,String linkuser,String linkpass,String emessage1,String emessage2,String emessage3,String companynamedata,String locationdata,String jobtitledata) throws InterruptedException {
		
		obj.loginwithvalidation(emaildata, newpassword,invalidpassword, emessage1, emessage2, emessage3);	
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
	

}
