package whatsappweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capriconians.utility.testutil;



public class meaning {
	
	
		
		public static WebDriver driver;
			
			public static void  browseropendata() throws InterruptedException {
				String vi="D:\\apps\\selenium\\chromedriver.exe";
				
				System.setProperty("webdriver.chrome.driver",vi);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://web.whatsapp.com/");
				WebElement search=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/div[1]/div[2]"));
				Thread.sleep(3000);
				search.click();
				search.sendKeys("IPL");
				WebElement name=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]"));
				testutil.explicit(name);
				name.click();
				for(int i=0;i<100;i++) {
				WebElement enter=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/footer[1]/div[1]/div[2]/div[1]/div[2]"));
				testutil.explicit(enter);
				enter.sendKeys("use");
				WebElement clickdata=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/footer[1]/div[1]/div[3]"));
				testutil.explicit(clickdata);
				clickdata.click();
			}
			}

		

		


	


}
