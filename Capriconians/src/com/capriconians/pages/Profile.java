package com.capriconians.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.capriconians.base.baseclass;
import com.capriconians.utility.datepicker;
import com.capriconians.utility.testutil;

public class Profile extends baseclass {
	
	
	String date[];
	String date1[];
	String date2[];
	String date3[];
	int flag=0;
	
	
	
	String filelocation="C:\\Users\\midhu\\Downloads\\sk.jpg";
	
	datepicker obj;
	
	@FindBy(xpath="//header/div[1]/div[3]/button[5]/span[2]/span[1]/div[1]/div[1]/img[1]")
	WebElement accountmenu;
	
	@FindBy(xpath="//span[contains(text(),'Edit Profile')]")
	WebElement editprofile;
	
	@FindBy(xpath="//span[contains(text(),'Cancel')]")
	WebElement cancel;
	
	@FindBy(xpath="//div[@class='c-edit-profile__details full-width text-black no-shadow no-border-radius q-card']/div[1]/div[2]/label[2]/div")
	WebElement jobtitle;
	
	@FindBy(xpath="//div[@class='c-edit-profile__details full-width text-black no-shadow no-border-radius q-card']/div[1]/div[2]/label[5]/div")
	WebElement experience;
	
	@FindBy(xpath="//div[@class='c-edit-profile__details full-width text-black no-shadow no-border-radius q-card']/div[1]/div[2]/label[6]/div")
	WebElement businessfunction;
	
	@FindBy(xpath="//div[@class='c-edit-profile__details full-width text-black no-shadow no-border-radius q-card']/div[1]/div[2]/label[7]/div")
	WebElement companyname;
	
	@FindBy(xpath="//div[@class='c-edit-profile__details full-width text-black no-shadow no-border-radius q-card']/div[1]/div[2]/label[7]/div/div[1]/div[1]/div[1]/input")
	WebElement location;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[2]/label[9]/div[1]/div[1]/div[1]/input[1]")
	WebElement mobile;
	
	@FindBy(xpath="//i[contains(text(),'arrow_back_ios')]")
	WebElement backbutton;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[2]/label[10]/div[1]/div[1]/div[1]/input[1]")
	WebElement birthdate;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[2]/label[10]/div[1]/div[2]/div[1]/div[1]")
	WebElement birthdaymsg;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]")
	WebElement proficon;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[2]")
	WebElement avatar;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/a[1]/span[2]/span[1]/div[1]/div[1]/div[1]/div[3]")
	WebElement uploadclick;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/button[2]/span[2]/span[1]")
	WebElement continueclick;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement save;
	
	@FindBy(xpath="//input[@id='okta-signin-username']")
	WebElement loginusername;
	
	@FindBy(xpath="//input[@id='okta-signin-password']")
	WebElement loginpassword;
	
	@FindBy(xpath="//input[@id='okta-signin-submit']")
	WebElement loginsubmit;
	
	@FindBy(xpath="//span[contains(text(),'Settings')]")
	WebElement settings;
	
	@FindBy(xpath="//div[contains(text(),'Create Company Page')]")
	WebElement create;
	
	@FindBy(xpath="//div[@class='c-company-profile__form']/label[1]/div[1]/div[1]/div[1]/input")
	WebElement Companyname1;
	
	@FindBy(xpath="//div[@class='c-company-profile__form']/label[4]/div[1]/div[1]/div[1]")
	WebElement industrydata;
	
	@FindBy(xpath="//div[@class='c-company-profile__form']/label[6]/div[1]/div[1]/div[1]/div[1]/input")
	WebElement headquarter;
	
	@FindBy(xpath="//div[@class='c-company-profile__form']/label[9]/div[1]/div[1]/div[1]/input")
	WebElement websitedata;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[3]/form[1]/div[4]/div[1]/div[1]/div[1]/*[1]")
	WebElement check;
	
	@FindBy(xpath="//span[contains(text(),'Publish')]")
	WebElement publish;
	
	@FindBy(xpath="//div[contains(text(),'Create Company Page')]")
	WebElement manage;
	
	@FindBy(xpath="//*[@id=\"q-app\"]/div/div/div/main/div[2]/div[5]/div/div/div/div/div/div/div/div[2]/a/span[2]/span/div/div/div/div[3]")
	WebElement addproject;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/a[1]/span[2]/span[1]/div[1]/div[1]/div[1]/div[3]")
	WebElement addimage;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement projecttitle;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/label[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement projectjobtitle;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement startdate;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/label[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement enddate;
	
	@FindBy(xpath="//span[contains(text(),'Project Team')]")
	WebElement projectteam;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/div[2]/label[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement projectrole;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[2]/span[1]/div[1]/div[1]/img[1]")
	WebElement adduser;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/label[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement searchuser;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement selectuser;
	
	@FindBy(xpath="//span[contains(text(),'Project Details')]")
	WebElement projectdetails;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement projectgoal;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[2]/div[1]/label[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement projectscope;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement saveproject;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/button[1]/span[2]/span[1]")
	WebElement draftbutton;
	
	@FindBy(xpath="//span[contains(text(),'Edit Project')]")
	WebElement editproject;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement projectimage;
	
	@FindBy(xpath="//span[contains(text(),'Publish')]")
	WebElement publishproject;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/a[1]/span[2]/span/span")
	WebElement userclick;
	
	@FindBy(xpath="//div[contains(text(),'Projects')]")
	WebElement projectstab;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/button[2]/span[2]/span[1]")
	WebElement projectcontinue;
	
	@FindBy(xpath="//span[contains(text(),'Feb')]")
	WebElement feb;
	
	@FindBy(xpath="//span[contains(text(),'Apr')]")
	WebElement mar;
	
	@FindBy(xpath="//span[contains(text(),'Until now')]")
	WebElement until;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]")
	WebElement out;
	
	@FindBy(xpath="//*[@id=\"q-app\"]/div/div/div/main/div[2]/form/div/div[1]/div[3]/button/span[2]/span/img")
	WebElement removeimage;
	
	@FindBy(xpath="//div[contains(text(),'About Me')]")
	WebElement aboutme;
	
	@FindBy(xpath="//div[contains(text(),'About')]")
	WebElement about;
	
	
	@FindBy(xpath="//*[@id=\"q-app\"]/div/div/div/main/div[2]/div[5]/div/div/div/div/div/div/div[2]/a/span[2]/span/div/div/div/div[3]")
	WebElement addpost;
	
	@FindBy(xpath="//span[contains(text(),'Add Hashtag')]")
	WebElement addhashtag;
	
	@FindBy(xpath="//div[@class='row full-width c-search-user ']/label/div/div/div/input")
	WebElement enterhashtag;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[2]/span[1]")
	WebElement createnewtag;
	
	@FindBy(xpath="//div[contains(text(),'simple')]")
	WebElement tag2;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[6]/div[1]/div[1]/div[1]/div[1]")
	WebElement messagebox;
	
	@FindBy(xpath="//div[@class='full-width q-mt-sm']//following-sibling::div/div/div[contains(text(),'weekendtrips')]")
	WebElement tag3;
	
	@FindBy(xpath="//div[contains(text(),'bicycle')]")
	WebElement tag4;
	
	@FindBy(xpath="//div[contains(text(),'manipul')]")
	WebElement tag5;
	
	@FindBy(xpath="//div[contains(text(),'apple1')]")
	WebElement tag6;
	
	@FindBy(xpath="//span[contains(text(),'Done')]")
	WebElement donetag;
	
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/i[1]")
	WebElement closetag;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[4]/div[2]/i[1]")
	WebElement closetagpost;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/label[1]/div[1]/div[1]/div[1]/textarea[1]")
	WebElement postdescription;
	
	@FindBy(xpath="//*[@id=\"q-app\"]/div/div/div/main/div[5]/div[1]/div/div/button[2]/span[2]/span/i")
	WebElement postimage;
	
	@FindBy(xpath="//span[contains(text(),'Post')]")
	WebElement postsubmit;
	
	@FindBy(xpath="//i[contains(text(),'arrow_back_ios')]")
	WebElement back;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]")
	WebElement firstpost;
	
	@FindBy(xpath="//span[contains(text(),'Delete')]")
	WebElement deletepost;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[5]/div[1]/div[1]/div[2]/div[1]/button[2]/span[2]/span[1]/span[1]")
	WebElement continuepost;
	
	@FindBy(xpath="//header/div[1]/div[3]/a[1]/span[2]/span[1]/img[1]")
	WebElement home;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]/span[2]/span[1]/i[1]")
	WebElement postlike;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[2]/span[2]/span[1]/img[1]")
	WebElement comment;
	
	@FindBy(xpath="//html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[3]/div[1]/label[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement commentdata;
	
	@FindBy(xpath="//span[contains(text(),'Post')]")
	WebElement postcomment;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[4]/div[2]")
	WebElement viewcomment;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[4]")
	WebElement addedcomment;
	
	@FindBy(xpath="//header/div[1]/div[3]/a[2]/span[2]/span[1]/img[1]")
	WebElement menu2;
	
	@FindBy(xpath="//div[contains(text(),'Consultants')]")
	WebElement consultant;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]")
	WebElement likecount;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/span[1]")
	WebElement endorsementcount;
	
	@FindBy(xpath="//i[contains(text(),'favorite_border')]")
	WebElement likeconsultant;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div[1]/div/div/div[2]/div[2]/div[5]/div/div/div[5]/div[2]/span")
	WebElement clickendorse;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/button[2]/span[2]/span[1]/span[1]")
	WebElement follow;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div[1]/div/div/div[1]/div/div[3]/div[1]/div/div/i[1]")
	WebElement dotbutton;
	
	@FindBy(xpath="//span[contains(text(),'Ask for Feedback')]")
	WebElement askforfeedback;
	
	@FindBy(xpath="//span[contains(text(),'Client')]")
	WebElement client;
	
	@FindBy(xpath="//span[contains(text(),'Ask for Endorsement')]")
	WebElement askforendorse;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]/span[2]/span[1]/img[1]")
	WebElement sendmessage;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement entermessage;
	
	@FindBy(xpath="//i[contains(text(),'close')]")
	WebElement closebutton;
	
	@FindBy(xpath="//*[@id=\"q-app\"]/div/div/div/main/div[2]/div/div/main/div[2]/div[1]/div[1]/div/div[2]/div/div[3]")
	WebElement firstpost1;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]")
	WebElement firstpostimage;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement firstconsult;
	
	@FindBy(xpath="//div[contains(text(),'Posts')]")
	WebElement posts;
	
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement inputemail;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/div[2]")
	WebElement next;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement inputpassword;
	
	@FindBy(xpath="//span[contains(text(),'Not now')]")
	WebElement notnow;
	
	@FindBy(xpath="//body/div[1]/div[7]/div[1]/a[1]/span[2]")
	WebElement emailendorsement;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[10]/div[1]/a[1]/span[2]")
	WebElement emailfeedback;
	
	@FindBy(xpath="//body/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement closepost;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement yopmailvalue;
	
	@FindBy(xpath="//input[@class='sbut']")
	WebElement checkmail;
	
	@FindBy(xpath="//span[contains(text(),'Activate Account')]")
	WebElement clickmail;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/a[2]/span[2]/span/span")
	WebElement companyclick;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[2]/span[1]/div[1]/div[1]/div[1]/div[3]")
	WebElement addcompanypost;
	
	@FindBy(xpath="//tbody/tr[1]/td[2]/a[1]")
	WebElement deletebox;
	
	@FindBy(xpath="//a[contains(text(),'Empty Inbox')]")
	WebElement deletemail;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[3]/div[1]/center[1]")
	WebElement nomessage;
	
	@FindBy(xpath="//div[contains(text(),'About')]")
	WebElement firstcompanypost;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/span[2]/span[1]/div[1]/div[1]/div[1]/div[3]")
	WebElement addcompanyproject;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/a[1]/span[2]/span[1]/div[1]/div[1]/div[1]/div[3]")
	WebElement uploadimage;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[2]/div[1]/button[2]/span[2]/span[1]")
	WebElement continueimage;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[2]/label[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement cprojectttie;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[2]/label[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement cjobtitle;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement cstartdate;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement cprojectrole;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement cprojectscope;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]")
	WebElement remotework;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/label[6]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement goodabouproject;
	
	@FindBy(xpath="//span[contains(text(),'Done')]")
	WebElement donedraft;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/button[1]/span[2]/span[1]")
	WebElement cdraft;
	
	@FindBy(xpath="//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[3]/button[1]/span[2]/span[1]/img[1]")
	WebElement deleteimage;
	
	@FindBy(xpath="//*[@id=\"q-app\"]/div/div/div/main/div[2]/div/div/main/div[2]/div[1]/div[3]/div/div/div/div[2]/i")
	WebElement dots;
	
	@FindBy(xpath="//header/div[1]/div[3]/button[4]/span[2]/span[1]/img[1]")
	WebElement message;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")
	WebElement chatlistuser;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[3]/label[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement messageinput;
	
	@FindBy(xpath="//div[contains(text(),'Send')]")
	WebElement sendbutton;
	
	@FindBy(xpath="//div[text()='now']//ancestor::div[@class='scroll relative-position fit hide-scrollbar']/div/div[last()]/div/div[1]")
	WebElement senddata;
	
	
	@FindBy(xpath="//div[contains(text(),'Sign out')]")
	WebElement signout;
	
	@FindBy(xpath="//div[text()='now']//ancestor::div[@class='scroll relative-position fit hide-scrollbar']/div/div[last()]/div/div[1]")
	WebElement recieved;
	
	@FindBy(xpath="/html/body/div[5]/div[2]/div/div[3]/button[2]/span[2]/span/span")
	WebElement ask;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div[3]/div[2]/button/span[2]/span/span")
	WebElement subscribe;
	
	
	

						
	
	public Profile() {

		PageFactory.initElements(driver, this);
		obj=new datepicker();
		
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
	
	public void updateprofile(String jobtitledata,String experiencedata,String bfunctiondata,String companynamedata,String locationdata,String mobiledata,String invaliddob,String validdob,String errmsg) throws InterruptedException, AWTException, IOException {
		
		testutil.explicit(accountmenu);
		accountmenu.click();
		testutil.explicit(editprofile);
		editprofile.click();
		Thread.sleep(1000);

		testutil.uploadimage(proficon,avatar,uploadclick,filelocation,continueclick,save);
	
		testutil.explicit(experience);
		experience.click();
		Thread.sleep(500);
		WebElement experiencename=driver.findElement(By.xpath("//div[contains(text(),'"+experiencedata+"')]"));
		experiencename.click();	
		
		testutil.scrolldown(jobtitle);
		testutil.explicit(businessfunction);
		businessfunction.click();
		Thread.sleep(500);
		WebElement businessfunctionname=driver.findElement(By.xpath("//div[contains(text(),'"+bfunctiondata+"')]"));		
		businessfunctionname.click();
		
		
		
		/*testutil.explicit(companyname);
		companyname.click();
		Thread.sleep(500);
		WebElement companynamename=driver.findElement(By.xpath("//div[contains(text(),'"+companynamedata+"')]"));	
		companynamename.click();*/
		
		/*testutil.explicit(location);
		location.sendKeys(locationdata);*/
		Actions builder = new Actions(driver);        
		//builder.sendKeys(Keys.ENTER);
		
		testutil.explicit(mobile);
		mobile.sendKeys(mobiledata);        
		builder.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		testutil.scrolldown(location);
		
		testutil.explicit(birthdate);
		birthdate.click();
		
		
		date=invaliddob.split("-");
		System.out.println("******************************");
		obj.date(date);
		
		testutil.explicit(birthdaymsg);
		Assert.assertEquals(errmsg, birthdaymsg.getText());
		
		birthdate.click();
		date1=validdob.split("-");
		System.out.println("******************************");
		obj.date(date1);
	
		testutil.explicit(accountmenu);
		accountmenu.click();
			
		
	}
	public void create_company(String company,String industry,String location,String website) throws InterruptedException, AWTException, IOException {
		
		testutil.explicit(accountmenu);
		accountmenu.click();
		testutil.explicit(settings);
		settings.click();
		testutil.explicit(manage);
		manage.click();
		Thread.sleep(2000);
		//driver.switchTo().frame("tidio-chat-code");
		testutil.explicit(subscribe);
		testutil.javascriptclick(subscribe);
		testutil.uploadimage(proficon, avatar, uploadclick, filelocation, continueclick, save);
		
		testutil.explicit(Companyname1);
		Companyname1.sendKeys(company);
		
		testutil.explicit(industrydata);
		industrydata.click();
		Thread.sleep(500);
		WebElement industrydataname=driver.findElement(By.xpath("//div[contains(text(),'"+industry+"')]"));		
		industrydataname.click();
		
		Thread.sleep(1000);
		testutil.scrolldown(industrydata);
		testutil.explicit(headquarter);
		headquarter.sendKeys(location);
		
		testutil.scrolldown(websitedata);
		testutil.explicit(websitedata);
		websitedata.sendKeys(website);
		
		testutil.scrolldown(check);
		testutil.explicit(check);
		check.click();
		testutil.explicit(publish);
		publish.click();
		testutil.explicit(settings);
		Thread.sleep(1000);
	}
	
	public void createproject(String projecttitle1,String jobtitle1,String startdate1,String enddate1,String projectrole1,String searchdata,String goal1,String projectscope1) throws InterruptedException, AWTException, IOException {
	    
		testutil.explicit(accountmenu);
		accountmenu.click();
		testutil.explicit(projectstab);
		projectstab.click();;
		testutil.explicit(addproject);
		testutil.javascriptclick(addproject);
		
		
		testutil.explicit(addimage);
		Thread.sleep(2000);
		addimage.click();


		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\midhu\\Documents\\fileupload.exe");
		
	    testutil.explicit(projectcontinue);
	    
	   // projectcontinue.click();
	    testutil.javascriptclick(projectcontinue);

	    Thread.sleep(1500);

	    testutil.explicit(projecttitle);
	    projecttitle.sendKeys(projectrole1);
	    testutil.explicit(projectjobtitle);
	    projectjobtitle.sendKeys(jobtitle1);
	    testutil.scrolldown(projecttitle);
		
	    testutil.explicit(startdate);
	    startdate.click();
	    date2=startdate1.split("-");
	    testutil.explicit(feb);
	    testutil.javascriptclick(feb);
		obj.date1(date2);
		
		testutil.explicit(enddate);
		enddate.click();
		testutil.explicit(until);
		testutil.javascriptclick(until);
	    
	
		testutil.scrolldown(projectteam);	
		testutil.explicit(projectteam);
		projectteam.click();
		testutil.explicit(projectrole);
		projectrole.sendKeys(projectrole1);;        
		projectrole.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		testutil.javascriptclick(projectrole);
		
		testutil.explicit(adduser);
		adduser.click();
		Thread.sleep(1000);
		testutil.explicit(searchuser);
		searchuser.sendKeys(searchdata);
		testutil.explicit(selectuser);
		selectuser.click();
		testutil.explicit(projectrole);
		projectrole.sendKeys(projectrole1);
		projectrole.sendKeys(Keys.ENTER);
		testutil.javascriptclick(projectrole);
		
		testutil.scrolldown(projectdetails);
		testutil.explicit(projectdetails);
		testutil.javascriptclick(projectdetails);
		Thread.sleep(1000);
		testutil.scrolltodown();

		
		testutil.explicit(projectgoal);
		projectgoal.sendKeys(goal1);
		projectgoal.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		projectgoal.click();
		testutil.explicit(projectscope);
		projectscope.sendKeys(projectscope1);
		projectscope.sendKeys(Keys.ENTER);
		testutil.javascriptclick(projectscope);
		

		Thread.sleep(500);
		
		testutil.explicit(saveproject);
		testutil.javascriptclick(saveproject);
		testutil.explicit(donedraft);
		testutil.javascriptclick(donedraft);
		
		
		testutil.explicit(draftbutton);
		String draftvalue=draftbutton.getText();
		Assert.assertEquals("Draft",draftvalue);
		
		draftbutton.click();
		testutil.explicit(editproject);
		testutil.javascriptclick(editproject);
		testutil.explicit(removeimage);
		Thread.sleep(3000);
		
	
		try {
            boolean imagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", projectimage);

            if (!imagePresent) {
                System.out.println("Image is NOT Displayed");
            }
            else {
                System.out.println("Image is Displayed");
            }
        }
        catch (Exception ex) {
            System.out.println("Unable to locate Element " + Arrays.toString(ex.getStackTrace()));
        }
		
		
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		testutil.explicit(publishproject);
		publishproject.click();
		testutil.explicit(editproject);
		testutil.explicit(back);
		testutil.javascriptclick(back);
		Thread.sleep(1000);
		

	
	}
	public void createpost(String postdescription1,String newtag,String postmessage1,String postmessage2) throws IOException, InterruptedException, AWTException {
		testutil.explicit(accountmenu);
		accountmenu.click();
		Thread.sleep(2000);
		testutil.explicit(aboutme);
		testutil.explicit(addpost);
		addpost.click();
		testutil.explicit(addhashtag);
		addhashtag.click();
		//testutil.explicit(enterhashtag);
		//Thread.sleep(6000);	
		//enterhashtag.sendKeys(newtag);
		//testutil.explicit(createnewtag);
		//createnewtag.click();
		testutil.explicit(tag2);
		tag2.click();
		testutil.explicit(tag3);
		tag3.click();
		testutil.explicit(tag3);
		testutil.javascriptclick(tag3);
		testutil.explicit(messagebox);
		Assert.assertEquals(postmessage1, messagebox.getText());
		Thread.sleep(6000);
		testutil.explicit(tag4);
		tag4.click();
		testutil.explicit(tag5);
		tag5.click();
		testutil.explicit(tag6);
		tag6.click();
		testutil.explicit(donetag);
		donetag.click();
		testutil.explicit(messagebox);
		Thread.sleep(1000);
		Assert.assertEquals(postmessage2,messagebox.getText());
		Thread.sleep(5000);
		testutil.explicit(closetag);
		closetag.click();
		testutil.explicit(donetag);
		donetag.click();
		testutil.explicit(closetagpost);
		closetagpost.click();
		testutil.explicit(postdescription);
		postdescription.sendKeys(postdescription1);
		testutil.scrolltodown();
		testutil.explicit(postimage);
		postimage.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\midhu\\Documents\\fileupload.exe");
		testutil.explicit(continuepost);
		Thread.sleep(1000);
	    testutil.javascriptclick(continuepost);
	    
		

		Thread.sleep(500);
		
		
		Thread.sleep(1000);
	    testutil.scrolldown(postsubmit);
		
	    testutil.explicit(postsubmit);
	    postsubmit.click();
	    
	    testutil.explicit(aboutme);
	    Thread.sleep(5000);
	    //testutil.explicit(deletepost);
	    //deletepost.click();
	    //testutil.explicit(continuepost);
	    //continuepost.click();
		
		
	}
	
	public void useractivity(String comment1,String name,String message,String email,String password,String mailendorsement,String mailfeedback,String ownname) throws InterruptedException, AWTException {
		
		testutil.explicit(home);
		testutil.javascriptclick(home);
		Thread.sleep(4000);
		testutil.explicit(firstpost1);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		testutil.javascriptclick(postlike);
		String color =postlike.getCssValue("color");
		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");

		int hexValue1=Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		int hexValue2=Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		int hexValue3=Integer.parseInt(hexValue[2]);

		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);

		Assert.assertEquals("#f44f39", actualColor);
		
		testutil.explicit(comment);
		comment.click();
		testutil.explicit(commentdata);
		Thread.sleep(3000);
		commentdata.sendKeys(comment1);
		testutil.explicit(postcomment);
		postcomment.click();
		testutil.explicit(addedcomment);
		
		Assert.assertEquals(comment1, addedcomment.getText());
		
		driver.get("http://yopmail.com");
		testutil.explicit(yopmailvalue);
		yopmailvalue.clear();
		yopmailvalue.sendKeys(email);
		Thread.sleep(1000);
		testutil.explicit(checkmail);
		checkmail.click();
		driver.switchTo().frame("ifinbox");
		String getmessage="";
		
		try {
			
			getmessage=nomessage.getText();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		if(getmessage.contains("No mail for")) {
			
			driver.get("http://dev.consally.com/");
		}
		else {
			
			
			testutil.explicit(deletebox);
			deletebox.click();
			testutil.explicit(deletemail);
			deletemail.click();
			testutil.explicit(nomessage);
			driver.get("http://dev.consally.com/");
		}
		
		
		testutil.explicit(menu2);
		menu2.click();
		testutil.explicit(consultant);
		testutil.javascriptclick(consultant);
		testutil.explicit(firstconsult);
		
		System.out.println("before while block");
		System.out.println(flag);
		
		while(flag==0) {
			
			System.out.println("in while block");
			
		try {
			System.out.println("in try block");	
		WebElement cuser=driver.findElement(By.xpath("//div[@class='q-avatar consultant-item__avatar-box']//following::div[1]/div[text()='"+name+"']"));
		testutil.explicit(cuser);
		System.out.println("running try block");
		flag=1;
		testutil.javascriptclick(cuser);
		}
		catch(Exception e) {
			
			Thread.sleep(4000);
			System.out.println("running catch block");
			js.executeScript("window.scrollBy(0,800)");
		}
		
		}
		
		
		
		
		testutil.explicit(posts);
		//js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		testutil.scrolldown(likeconsultant);
		String likedata=likecount.getText();
		likedata=likedata.substring(0,likedata.indexOf(" "));
		int i=Integer.parseInt(likedata);
		//System.out.println(i);
		i=i+1;
		int j=0;
		likeconsultant.click();
		Thread.sleep(1000);
		String likedata2=likecount.getText();
			
		System.out.println("darta is"+likedata2);
		likedata2=likedata2.substring(0,likedata2.indexOf(" "));
		System.out.println("darta is"+likedata2);
		j=Integer.parseInt(likedata2);
		System.out.println("j is"+j);

		Assert.assertEquals(j,i);
		
		testutil.explicit(endorsementcount);
		String endorse1=endorsementcount.getText();
		endorse1=endorse1.substring(0,endorse1.indexOf(" "));
		int m=Integer.parseInt(endorse1);
		m=m+1;
		testutil.explicit(clickendorse);
		clickendorse.click();
		Thread.sleep(2000);
		String endorse2=endorsementcount.getText();
		endorse2=endorse2.substring(0,endorse2.indexOf(" "));
		int n=Integer.parseInt(endorse2);
		Assert.assertEquals(n,m);
		
		testutil.explicit(follow);
		String beforefollow=follow.getText();
		follow.click();
		String afterfollow=follow.getText();
		
		if(beforefollow=="Follow") {
			
			Assert.assertEquals(afterfollow,"Following");
		}
		else if (beforefollow=="Following") {
			
			
			Assert.assertEquals(afterfollow,"Follow");
		}
		
		Thread.sleep(1000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
        robot.keyRelease(KeyEvent.VK_PAGE_UP);
		testutil.explicit(dotbutton);
		dotbutton.click();
		testutil.explicit(askforfeedback);
		askforfeedback.click();
		testutil.explicit(client);
		client.click();
		testutil.explicit(dotbutton);
		dotbutton.click();
		testutil.explicit(askforendorse);
		askforendorse.click();
		Thread.sleep(2500);
		testutil.explicit(ask);
		testutil.javascriptclick(ask);
		testutil.explicit(entermessage);
		Thread.sleep(4000);
		entermessage.sendKeys(message);
		testutil.explicit(sendmessage);
		sendmessage.click();
		Thread.sleep(5000);
		
		
		driver.get("http://yopmail.com");
		
		testutil.explicit(yopmailvalue);
		yopmailvalue.clear();
		yopmailvalue.sendKeys(email);
		Thread.sleep(1000);
		testutil.explicit(checkmail);
		checkmail.click();
		driver.switchTo().frame("ifinbox");
		
		testutil.explicit(emailendorsement);
		String endvalue=emailendorsement.getText();
		String fdvalue=emailfeedback.getText();
		String actualendorse=ownname+mailendorsement;
		String actualfeedback=ownname+mailfeedback;
		
		Assert.assertEquals(actualendorse,endvalue);
		Assert.assertEquals(actualfeedback,fdvalue);


		
		
	}
	
	public void companypostproject(String postmessage1,String postdescription1) throws InterruptedException, IOException, AWTException {
		
		
		testutil.explicit(firstpost1);
		testutil.explicit(accountmenu);
		accountmenu.click();
		testutil.explicit(settings);
		settings.click();
		Thread.sleep(2000);
		testutil.explicit(accountmenu);
		accountmenu.click();
		testutil.explicit(companyclick);
		companyclick.click();
		testutil.explicit(addcompanypost);
		testutil.javascriptclick(addcompanypost);
		
		
		testutil.explicit(addhashtag);
		addhashtag.click();
		testutil.explicit(tag2);
		tag2.click();
		testutil.explicit(tag3);
		tag3.click();
		testutil.explicit(tag3);
		testutil.javascriptclick(tag3);
		testutil.explicit(messagebox);
		Assert.assertEquals(postmessage1, messagebox.getText());
		Thread.sleep(6000);
		testutil.explicit(tag4);
		tag4.click();
		testutil.explicit(tag5);
		tag5.click();
		testutil.explicit(donetag);
		donetag.click();
		testutil.explicit(closetagpost);
		closetagpost.click();
		testutil.explicit(postdescription);
		postdescription.sendKeys(postdescription1);
		testutil.scrolltodown();
		testutil.explicit(postimage);
		postimage.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\midhu\\Documents\\fileupload.exe");
		testutil.explicit(continuepost);
		Thread.sleep(1000);
	    testutil.javascriptclick(continuepost);
	    

		
		Thread.sleep(1000);
	    testutil.scrolldown(postsubmit);
		
	    testutil.explicit(postsubmit);
	    postsubmit.click();
	    testutil.explicit(about);
	}
	
	public void companycreateproject(String projecttitle1,String jobtitle1,String startdate1,String crole,String cgoal,String cscope,String good) throws InterruptedException, AWTException, IOException {
	    

		//testutil.explicit(firstpost1);
		testutil.explicit(accountmenu);
		accountmenu.click();
		testutil.explicit(settings);
		settings.click();
		Thread.sleep(2000);
		testutil.explicit(accountmenu);
		accountmenu.click();
		testutil.explicit(companyclick);
		companyclick.click();
		testutil.explicit(projectstab);
		projectstab.click();
		testutil.explicit(addcompanyproject);
		testutil.javascriptclick(addcompanyproject);
		
		testutil.explicit(uploadimage);
		testutil.javascriptclick(uploadimage);
		

		Thread.sleep(1000);
		Runtime.getRuntime().exec("C:\\Users\\midhu\\Documents\\fileupload.exe");
	    testutil.explicit(continueimage);
	    testutil.javascriptclick(continueimage);
	    
	    
	    Thread.sleep(2500);
	    testutil.scrolldown(deleteimage);
	    testutil.explicit(cprojectttie);
	    cprojectttie.sendKeys(projecttitle1);
	    testutil.explicit(cjobtitle);
	    cjobtitle.sendKeys(jobtitle1);
		
	    testutil.explicit(cstartdate);
	    cstartdate.click();
	    date2=startdate1.split("-");
	    testutil.explicit(feb);
	    testutil.javascriptclick(feb);
		obj.date1(date2);
		

		
		testutil.scrolldown(projectdetails);
		testutil.explicit(projectdetails);
		projectdetails.click();
		Thread.sleep(1000);
		testutil.scrolltodown();

		
		testutil.explicit(cprojectrole);
		cprojectrole.sendKeys(cgoal);
		cprojectrole.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		cprojectrole.click();
		testutil.explicit(cprojectscope);
		cprojectscope.sendKeys(cscope);
		cprojectscope.sendKeys(Keys.ENTER);
		cprojectscope.click();
		testutil.scrolldown(remotework);
		testutil.explicit(remotework);
		remotework.click();
		testutil.explicit(goodabouproject);
		goodabouproject.sendKeys(good);
		goodabouproject.sendKeys(Keys.ENTER);
		goodabouproject.click();


		Thread.sleep(1000);
		
		testutil.explicit(saveproject);
		testutil.javascriptclick(saveproject);
		testutil.explicit(donedraft);
		testutil.javascriptclick(donedraft);
		
		
		testutil.explicit(cdraft);
		String draftvalue=cdraft.getText();
		Assert.assertEquals("Draft",draftvalue);
		
		cdraft.click();
		testutil.explicit(editproject);
		testutil.javascriptclick(editproject);
		testutil.explicit(removeimage);
		Thread.sleep(3000);
		
	
		try {
            boolean imagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", projectimage);

            if (!imagePresent) {
                System.out.println("Image is NOT Displayed");
            }
            else {
                System.out.println("Image is Displayed");
            }
        }
        catch (Exception ex) {
            System.out.println("Unable to locate Element " + Arrays.toString(ex.getStackTrace()));
        }
		
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		testutil.explicit(publishproject);
		publishproject.click();
		testutil.explicit(editproject);
		testutil.explicit(back);
		testutil.javascriptclick(back);
		

	
	}

	public void chat(String message1,String username,String password,String username2,String password2,String message2) throws InterruptedException {
	
	testutil.explicit(message);
	message.click();
	testutil.explicit(chatlistuser);
	chatlistuser.click();
	//WebDriverWait wait=new WebDriverWait(driver, 15);
	//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Please wait while we are connecting to the chat!')]"))));
	Thread.sleep(6000);
	testutil.explicit(messageinput);
	messageinput.sendKeys(message1);
	testutil.javascriptclick(sendbutton);
	Thread.sleep(2000);
	testutil.explicit(senddata);
	String seendata=senddata.getText();
	Assert.assertEquals(seendata,message1);
	
	testutil.explicit(accountmenu);
	accountmenu.click();
	testutil.explicit(userclick);
	userclick.click();
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

	testutil.explicit(message);
	message.click();
	testutil.explicit(chatlistuser);
	chatlistuser.click();
	
	//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Please wait while we are connecting to the chat!')]"))));
	Thread.sleep(7000);
	testutil.explicit(recieved);
	String recievedata=recieved.getText();
	Assert.assertEquals(recievedata,message1);
	testutil.explicit(messageinput);
	messageinput.sendKeys(message2);
	testutil.javascriptclick(sendbutton);
	Thread.sleep(2000);
	
	
	testutil.explicit(accountmenu);
	accountmenu.click();
	testutil.explicit(userclick);
	userclick.click();
	testutil.explicit(settings);
	testutil.javascriptclick(settings);
	testutil.explicit(signout);
	signout.click();
	
	testutil.explicit(loginusername);
	loginusername.clear();
	loginpassword.clear();
	loginusername.sendKeys(username2);
	testutil.explicit(loginpassword);
	loginpassword.sendKeys(password2);
	testutil.explicit(loginsubmit);
	loginsubmit.click();

	testutil.explicit(message);
	message.click();
	testutil.explicit(chatlistuser);
	chatlistuser.click();
	Thread.sleep(6000);
	//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Please wait while we are connecting to the chat!')]"))));
	testutil.explicit(recieved);
	String recievedata2=recieved.getText();
	Assert.assertEquals(recievedata2,message2);
	testutil.explicit(accountmenu);
	accountmenu.click();
	testutil.explicit(userclick);
	userclick.click();
	testutil.explicit(settings);
	testutil.javascriptclick(settings);
	
}


}
