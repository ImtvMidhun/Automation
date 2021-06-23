package com.capriconians.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capriconians.base.baseclass;
import com.capriconians.pages.Profile;
import com.capriconians.pages.activities;
import com.capriconians.pages.signup;
import com.capriconians.utility.testutil;

public class activitiestest extends baseclass{
	
	String sheetnames="Share";
	String data2[][];
	activities obj;
	
	@BeforeClass
	public void objects() {

		browseropen("chrome");
		obj=new activities();

	}
	
	@DataProvider
	public String[][] getdata2() throws IOException {
	
		data2=testutil.gettestdata(sheetnames,1,7);
		return data2;
	}
	
	@Test(dataProvider="getdata2")
	
	public void data(String username,String password,String name,String datamessage,String companyname,String username2,String password2) throws InterruptedException {
		
		obj.login(username2, password2);
		obj.companyadmin(username, password, name, datamessage, companyname);
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}

}
