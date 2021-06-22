package src.mobileapp.pages;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import src.mobileapp.base.base;
import src.mobileapp.utility.testutil;

public class Meet extends base {

	
	@AndroidFindBy(xpath="//*[@contentDescription='Notifications, tab, 2 of 5']")
	AndroidElement favicon;
	
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
	
	

	
			
	
			
												
			
	public Meet() {

		

		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}

	public void createseries(String meettype1) throws InterruptedException {
		
		
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
		AndroidElement typeinsert=driver.findElement(By.xpath("//*[@text='"+meettype1+"']"));
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
	
	public void createmeeting(String topic,String audience) throws InterruptedException {
		
		/*testutil.explicit(favicon);
		favicon.click();
		testutil.explicit(meet);
		meet.click();*/
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
		Thread.sleep(1000);
		testutil.androidscroll();
		testutil.explicit(targetaudience);
		AndroidElement taudience=driver.findElement(By.xpath("//*[@text='"+audience+"']"));
		taudience.click();
		testutil.explicit(attendies);
		attendies.click();
		
	}

}
