package com.interview.test;



import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.interview.base.base;
import com.interview.pages.login;
import com.interview.testutil.testutil;

public class logintest extends base {
	
	
	login obj;
	String data2[][];
	
	@BeforeMethod
	
	public void beforedata() {
		
		base.baseclass();
		obj=new login();
		
	}
	
	@DataProvider
	
	public String[][] getdata2() throws IOException {
		
		data2=testutil.getdata("Sheet1",1, 2);
		return data2;
	}
	
	@Test(dataProvider="getdata2")
	
	public void logindata(String username,String password) throws InterruptedException, IOException {
		
		obj.logindata(username, password);
		
		
		
	}
	@Test
	
	public void seconddata() throws InterruptedException, IOException, AWTException {
		
		obj.second();
		
		
		
	}
	
	@AfterMethod
	public void quit() {
		
		
		
	}
	
	


}
