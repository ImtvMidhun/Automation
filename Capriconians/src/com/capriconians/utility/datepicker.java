package com.capriconians.utility;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import java.sql.Date;



import com.capriconians.base.baseclass;


public class datepicker extends baseclass{
	
	String start;
	String end;
	int firstyear;
	int lastyear;
	SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
	float daysBetween;
		
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div[3]/button/span[2]/span/i")
	WebElement rightarrow;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[3]/button/span[2]/span/i")
	WebElement rightarrow1;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div[1]/button/span[2]/span/i")
	WebElement leftarrow;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[1]/button/span[2]/span/i")
	WebElement leftarrow1;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div[1]/div[5]/div/button/span[2]/span/span")
	WebElement currentdate;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[1]/div[5]/div/button/span[2]/span/span")
	WebElement currentdate1;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div[2]/div[1]/button/span[2]/span/span")
	WebElement startyear;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[2]/div[1]/button/span[2]/span/span")
	WebElement startyear1;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div[2]/div[21]/button/span[2]/span/span")
	WebElement endyear;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[2]/div[21]/button/span[2]/span/span")
	WebElement endyear1;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div/button/span[2]/span/span")
	WebElement monthselect;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div[1]/div[2]/div/button/span[2]/span/span")
	WebElement monthselect1;
	

		
		
	public datepicker() {
		
		PageFactory.initElements(driver,this);
				
	}
	
	public void date(String[] passdate) throws InterruptedException {
				
		testutil.explicit(currentdate);
		testutil.javascriptclick(currentdate);

		
		int actual=Integer.parseInt(passdate[2]);
	
		while(true) {
			
			testutil.explicit(startyear);
			start=startyear.getText();
			end=endyear.getText();
			firstyear=Integer.parseInt(start);
			lastyear=Integer.parseInt(end);
			
			if(actual<firstyear) {
				
			testutil.explicit(leftarrow);
			leftarrow.click();
			}
			
		else if(actual>lastyear) {
			
			testutil.explicit(rightarrow);
			rightarrow.click();
		}
		else {
			Thread.sleep(500);
			WebElement yearclick=driver.findElement(By.xpath("//span[text()='"+passdate[2]+"']"));
			testutil.explicit(yearclick);
			testutil.javascriptclick(yearclick);
			
			testutil.explicit(monthselect);
			monthselect.click();
			Thread.sleep(500);
			WebElement monthclick=driver.findElement(By.xpath("//span[text()='"+passdate[1]+"']"));
			testutil.explicit(monthclick);
			testutil.javascriptclick(monthclick);
			passdate[0]=passdate[0].replaceFirst("0", "");
			System.out.println(passdate[0]);
			WebElement dayclick=driver.findElement(By.xpath("//span[text()='"+passdate[0]+"']"));
			Thread.sleep(500);
			testutil.explicit(dayclick);
			testutil.javascriptclick(dayclick);
			break;
		
		}
		}
		
		
		
	}
	
	public void date1(String[] passdate) throws InterruptedException {
		
		testutil.explicit(currentdate1);
		testutil.javascriptclick(currentdate1);

		
		int actual=Integer.parseInt(passdate[2]);
	
		while(true) {
			
			testutil.explicit(startyear1);
			start=startyear1.getText();
			end=endyear1.getText();
			firstyear=Integer.parseInt(start);
			lastyear=Integer.parseInt(end);
			
			if(actual<firstyear) {
				
			testutil.explicit(leftarrow1);
			leftarrow1.click();
			}
			
		else if(actual>lastyear) {
			
			testutil.explicit(rightarrow1);
			rightarrow1.click();
		}
		else {
			Thread.sleep(500);
			WebElement yearclick=driver.findElement(By.xpath("//span[text()='"+passdate[2]+"']"));
			testutil.explicit(yearclick);
			testutil.javascriptclick(yearclick);
			
			testutil.explicit(monthselect1);
			monthselect1.click();
			Thread.sleep(500);
			WebElement monthclick=driver.findElement(By.xpath("//span[text()='"+passdate[1]+"']"));
			testutil.explicit(monthclick);
			testutil.javascriptclick(monthclick);
			passdate[0]=passdate[0].replaceFirst("0", "");
			System.out.println(passdate[0]);
			WebElement dayclick=driver.findElement(By.xpath("//span[text()='"+passdate[0]+"']"));
			Thread.sleep(500);
			testutil.explicit(dayclick);
			testutil.javascriptclick(dayclick);
			break;
		
		}
		}
		
		
		
	}
	
	
	public float substractdate(String dateBeforeString ,String dateAfterString) {
		
		try {
			 
		       Date dateBefore = myFormat.parse(dateBeforeString);
		       Date dateAfter = myFormat.parse(dateAfterString);
		       long difference = dateAfter.getTime() - dateBefore.getTime();
		       daysBetween = (difference / (1000*60*60*24));
		       daysBetween=daysBetween+1;
		       System.out.println("Number of Days between dates: "+daysBetween);
			       
			 } catch (Exception e) {
			       e.printStackTrace();
			 }
			 return daysBetween;
		}
}



