package src.realappium.pages;






import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import src.realappium.base.base;
import src.realappium.utility.testutil;

public class Meet extends base {

	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Notifications, tab, 2 of 5\"]/android.view.ViewGroup")
	static AndroidElement favicon;
	
	@AndroidFindBy(xpath="((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup'] and ./parent::*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]]]]]]]]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[2]/*/*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup']])[1]")
	AndroidElement meet;
	
	@AndroidFindBy(xpath="//*[@class='android.view.ViewGroup' and ./*[@text='Meet' and @class='android.widget.TextView'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Search for Meetups']]")
	AndroidElement meetup;
	
	@AndroidFindBy(xpath="//*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]]")
	AndroidElement addseries;
	
	@AndroidFindBy(xpath="//*[@text='Choose the meetup type']")
	AndroidElement typeofmeetup;
	
	@AndroidFindBy(xpath="//*[@class='android.view.ViewGroup' and ./*[@text='Publish']]")
	AndroidElement publish;
	
	@AndroidFindBy(xpath="((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[1]/*[@class='android.widget.TextView'])[1]")
	AndroidElement verifyseriestype;
	
	@AndroidFindBy(xpath="((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[1]/*[@class='android.widget.TextView'])[2]")
	AndroidElement verifyusername;
	
	@AndroidFindBy(xpath="((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[1]/*[@class='android.widget.TextView'])[8]")
	AndroidElement subscribedcount;
	
	@AndroidFindBy(xpath="((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']])[1]/*[@class='android.widget.TextView'])[9]")
	AndroidElement scheduledcount;
	
	@AndroidFindBy(xpath="(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*/*/*/*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]])[1]")
	AndroidElement selectseries;
	
	@AndroidFindBy(xpath="//*[@class='android.widget.ImageView' and ./parent::*[@class='android.view.ViewGroup']]")
	AndroidElement addmeeting;
	
	@AndroidFindBy(xpath="//*[@text='Choose the topic']")
	AndroidElement choosetopic;
	
	@AndroidFindBy(xpath="//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@class='android.view.ViewGroup']]]")
	AndroidElement typetopic;
	
	@AndroidFindBy(xpath="//*[@class='android.widget.TextView' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[./parent::*[@class='android.widget.ScrollView']]]]]]")
	AndroidElement selecttopic;
	
	@AndroidFindBy(xpath="//*[@text='Choose the target audience']")
	AndroidElement targetaudience;
	
	@AndroidFindBy(xpath="//*[@text='Choose the number of attendees']")
	AndroidElement attendies;
	
	@AndroidFindBy(xpath="//*[@text='Up to 10']")
	AndroidElement selectattendies;
	
	@AndroidFindBy(xpath="((//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.view.ViewGroup'])[6]/*[@class='android.widget.TextView'])[2]")
	AndroidElement dateselect;
	
	@AndroidFindBy(xpath="//*[@text='Choose your timezone']")
	AndroidElement timezone;
	
	@AndroidFindBy(xpath="//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@class='android.view.ViewGroup']]]")
	AndroidElement searchtimezone;
	
	@AndroidFindBy(xpath="(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]]/*/*/*/*[@class='android.widget.TextView' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup']]]])[1]")
	AndroidElement selecttimezone;
	
	@AndroidFindBy(xpath="//*[@class='android.widget.EditText']")
	AndroidElement about;
	
	@AndroidFindBy(xpath="//*[@class='android.view.ViewGroup' and ./*[@text='Publish']]")
	AndroidElement publishmeeting;
	
	@AndroidFindBy(xpath="//*[@text='My Meetups']")
	AndroidElement seriestab;
	
	@AndroidFindBy(xpath="//*[@text='24']")
	AndroidElement date;
	
	@AndroidFindBy(xpath="//*[@text='OK']")
	AndroidElement ok;
	
	@AndroidFindBy(xpath="//*[@text='My Meetups']")
	AndroidElement mymeetup;
	
	@AndroidFindBy(xpath="//*[@text='Sign in']")
	AndroidElement signin;
	
	
	
	

	
			
	
			
												
			
	public Meet() {

		

		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}

	public void createseries(String meettype1) throws InterruptedException {

		System.out.println("first class");
		driver.context("NATIVE_APP");
		testutil.explicit(favicon);
		favicon.click();
		testutil.explicit(meet);
		meet.click();
		testutil.explicit(meetup);
		meetup.click();
		testutil.explicit(addseries);
		addseries.click();
		testutil.explicit(typeofmeetup);
		typeofmeetup.click();
		Thread.sleep(1500);
		AndroidElement typeinsert=driver.findElement(By.xpath("//*[@text='"+meettype1+"']"));
		testutil.explicit(typeinsert);
		typeinsert.click();
		testutil.explicit(typeinsert);
		testutil.explicit(publish);
		publish.click();
		
	}
	
	public String verifyseries() {
		
		testutil.explicit(verifyseriestype);
		String returnseries=verifyseriestype.getText();
		return returnseries;
		
	}
	public String verifyusername() {
		
		testutil.explicit(verifyusername);
		String returnusername=verifyusername.getText();
		return returnusername;
	}
	
	public String verifysubscribedcount() {
		
		testutil.explicit(subscribedcount);
		String returncount=subscribedcount.getText();
		return returncount;
	}
	
	public String verifyscheduledcount() {
		
		testutil.explicit(scheduledcount);
		String returncount2=scheduledcount.getText();
		return returncount2;
	}
	
	public void createmeeting(String topic,String audience,String timezone1,String about1) throws InterruptedException {
		
		testutil.explicit(signin);
		signin.click();
		System.out.println("second class");
		testutil.explicit(favicon);
		favicon.click();
		testutil.explicit(meet);
		meet.click();
		testutil.explicit(meetup);
		meetup.click();
		testutil.explicit(seriestab);
		seriestab.click();
		testutil.explicit(selectseries);
		selectseries.click();
		//testutil.javascriptclick(selectseries);
		testutil.explicit(addmeeting);
		addmeeting.click();
		testutil.explicit(choosetopic);
		choosetopic.click();
		testutil.explicit(typetopic);
		typetopic.sendKeys(topic);
		testutil.explicit(selecttopic);
		selecttopic.click();
		testutil.explicit(targetaudience);
		targetaudience.click();
		//Thread.sleep(3000);
		//testutil.androidscroll();
		@SuppressWarnings("rawtypes")
		TouchAction touch =new TouchAction(driver);
		touch.press(PointOption.point(678,1248)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(662,1059)).release().perform();
		touch.press(PointOption.point(710,1291)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(681,1040)).release().perform();

		AndroidElement taudience=driver.findElement(By.xpath("//*[@text='"+audience+"']"));
		taudience.click();
		testutil.explicit(attendies);
		attendies.click();
		testutil.explicit(selectattendies);
		selectattendies.click();
		testutil.explicit(dateselect);
		dateselect.click();
		testutil.explicit(date);
		date.click();
		testutil.explicit(ok);
		ok.click();
		testutil.explicit(ok);
		ok.click();
		testutil.explicit(timezone);
		timezone.click();
		testutil.explicit(searchtimezone);
		searchtimezone.sendKeys(timezone1);
		testutil.explicit(selecttimezone);
		selecttimezone.click();
		testutil.explicit(about);
		about.sendKeys(about1);
		testutil.explicit(publish);
		publish.click();
		testutil.explicit(mymeetup);
		
		
		
		
		
		
		
	}

}
