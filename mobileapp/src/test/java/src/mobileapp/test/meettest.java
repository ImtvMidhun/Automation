package src.mobileapp.test;

import static org.junit.Assert.assertArrayEquals;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import src.mobileapp.base.base;
import src.mobileapp.pages.Meet;
import src.mobileapp.pages.login;
import src.mobileapp.utility.testutil;



public class meettest extends base {
	
	Meet obj;
	String sheet1="Sheet1";
	String sheet2="Sheet2";
	String data2[][];
	login obj2;
	
	@BeforeMethod
	public void objects() throws MalformedURLException {
		
		base.setUp();
		//obj2=new login();
		obj=new Meet();
		base.open();
	

	}
	@DataProvider
	public String[][] getdata() throws IOException {
	
		data2=testutil.gettestdata(sheet1,1,5);
		return data2;
	}
	
	@DataProvider
	public String[][] getdata1() throws IOException {
	
		data2=testutil.gettestdata(sheet2,1,6);
		return data2;
	}
	
	@Test(dataProvider="getdata",priority=1,enabled=false)
	
	public void signin(String username,String password,String meettype1,String name,String topic) throws InterruptedException {
		
		//obj2.logindata(username, password);
		obj.createseries(meettype1);
		String seriestitle=obj.verifyseries();
		Assert.assertEquals(meettype1, seriestitle);

		String usertitle=obj.verifyusername();
		Assert.assertEquals(usertitle, name);
		
		String subcount=obj.verifysubscribedcount();
		Assert.assertEquals(subcount,"0");
		
		String schedulecount=obj.verifyscheduledcount();
		Assert.assertEquals(schedulecount,"0");
	}
	
	@Test(dataProvider="getdata1",priority=2) 	
		public void createmeeting(String username,String password,String topic,String audience,String timezone,String about) throws InterruptedException {
		
		//obj2.logindata(username, password);
		obj.createmeeting(topic, audience);
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
}
