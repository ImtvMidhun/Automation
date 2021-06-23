package com.capriconians.test;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capriconians.base.baseclass;
import com.capriconians.pages.Profile;
import com.capriconians.pages.account_settings;
import com.capriconians.utility.testutil;

public class Profile_test extends baseclass {
	
	String sheetname1="Editprofile";
	String sheetname2="useractivity";
	String data2[][];
	Profile obj;

	@BeforeMethod
	public void objects() {
		
		browseropen("chrome");
		obj=new Profile();
		

	}

	@DataProvider
	public String[][] getdata1() throws IOException {
	
		data2=testutil.gettestdata(sheetname1,1,29);
		return data2;
	}
	
	@DataProvider
	public String[][] getdata2() throws IOException {
	
		data2=testutil.gettestdata(sheetname2,1,23);
		return data2;
	}
	
	@Test(dataProvider="getdata1",priority=1,enabled=true)
	
	public void updateprofile(String jobtitledata,String experiencedata,String bfunctiondata,String companynamedata,String locationdata,String mobiledata,String invaliddob,String validdob,String birthdaymsg,String emaildata,String passworddata,String company,String industry,String location,String website,String projecttitle1,String jobtitle1,String startdate1,String enddate1,String projectrole1,String searchdata,String goal1,String projectscope1,String postdescription,String newtag,String postmessage1,String postmessage2,String username2,String password2) throws InterruptedException, AWTException, IOException {
		
	obj.login(emaildata, passworddata);	
	obj.updateprofile(jobtitledata,experiencedata,bfunctiondata,companynamedata,locationdata,mobiledata,invaliddob,validdob,birthdaymsg);
	}
	
	@Test(dataProvider="getdata1",priority=2,enabled=true)
	
	public void createcompany(String jobtitledata,String experiencedata,String bfunctiondata,String companynamedata,String locationdata,String mobiledata,String invaliddob,String validdob,String birthdaymsg,String emaildata,String passworddata,String company,String industry,String location,String website,String projecttitle1,String jobtitle1,String startdate1,String enddate1,String projectrole1,String searchdata,String goal1,String projectscope1,String postdescription,String newtag,String postmessage1,String postmessage2,String username2,String password2) throws InterruptedException, AWTException, IOException {
		
	obj.login(emaildata, passworddata);	
	obj.create_company(company,industry,location,website);
	}
	
	@Test(dataProvider="getdata1",priority=3,enabled=true)
	
	public void createproject(String jobtitledata,String experiencedata,String bfunctiondata,String companynamedata,String locationdata,String mobiledata,String invaliddob,String validdob,String birthdaymsg,String emaildata,String passworddata,String company,String industry,String location,String website,String projecttitle1,String jobtitle1,String startdate1,String enddate1,String projectrole1,String searchdata,String goal1,String projectscope1,String postdescription,String newtag,String postmessage1,String postmessage2,String username2,String password2) throws InterruptedException, AWTException, IOException {
		
	obj.login(username2, password2);	
	obj.createproject(projecttitle1,jobtitle1,startdate1,enddate1,projectrole1,searchdata,goal1,projectscope1);
	}
	@Test(dataProvider="getdata1",priority=4,enabled=true)
	
	public void createpost(String jobtitledata,String experiencedata,String bfunctiondata,String companynamedata,String locationdata,String mobiledata,String invaliddob,String validdob,String birthdaymsg,String emaildata,String passworddata,String company,String industry,String location,String website,String projecttitle1,String jobtitle1,String startdate1,String enddate1,String projectrole1,String searchdata,String goal1,String projectscope1,String postdescription,String newtag,String postmessage1,String postmessage2,String username2,String password2) throws InterruptedException, AWTException, IOException {
		
	obj.login(username2, password2);	
	obj.createpost(postdescription,newtag,postmessage1,postmessage2);
	}
	
	@Test(dataProvider="getdata2",priority=5,enabled=true)
	
	public void like_follow_endorse_comment(String comment,String name,String message,String email,String password,String mailendorsement,String mailfeedback,String ownname,String postmessage1,String postdescription1,String projecttitle1,String jobtitle1,String startdate1,String crole,String cgoal,String cscope,String good,String message1,String username2,String password2,String username3,String password3,String message2) throws InterruptedException, AWTException, IOException {
		
		obj.login(username3, password3);
		obj.useractivity(comment,name,message,email,password,mailendorsement,mailfeedback,ownname);
	
	}
	@Test(dataProvider="getdata2",priority=6,enabled=true)
	
	public void create_company_post(String comment,String name,String message,String email,String password,String mailendorsement,String mailfeedback,String ownname,String postmessage1,String postdescription1,String projecttitle1,String jobtitle1,String startdate1,String crole,String cgoal,String cscope,String good,String message1,String username2,String password2,String username3,String password3,String message2) throws InterruptedException, AWTException, IOException {
		
		obj.login(username2, password2);
		obj.companypostproject(postmessage1, postdescription1);
	
	}
	@Test(dataProvider="getdata2",priority=7,enabled=true)
	
	public void create_company_project(String comment,String name,String message,String email,String password,String mailendorsement,String mailfeedback,String ownname,String postmessage1,String postdescription1,String projecttitle1,String jobtitle1,String startdate1,String crole,String cgoal,String cscope,String good,String message1,String username2,String password2,String username3,String password3,String message2) throws InterruptedException, AWTException, IOException {
		
		obj.login(username2, password2);
		obj.companycreateproject(projecttitle1, jobtitle1, startdate1, crole, cgoal, cscope, good);	
		
	}
	@Test(dataProvider="getdata2",priority=8)
	
	public void chatuser(String comment,String name,String message,String email,String password,String mailendorsement,String mailfeedback,String ownname,String postmessage1,String postdescription1,String projecttitle1,String jobtitle1,String startdate1,String crole,String cgoal,String cscope,String good,String message1,String username2,String password2,String username3,String password3,String message2) throws InterruptedException, AWTException, IOException {
		
		obj.login(username3, password3);
		obj.chat(message1, username2, password2,username3,password3,message2);
		
	}
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	

}
