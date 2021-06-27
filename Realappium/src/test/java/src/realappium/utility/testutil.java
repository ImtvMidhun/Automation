package src.realappium.utility;


import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;





public class testutil extends src.realappium.base.base{
	

	
	//public static WebDriver driver;
	static Sheet sheets;
	static String deal="D:\\apps\\selenium\\Appium.xls";
	
	/*public testutil(WebDriver driver) {
	
	 this.driver=driver;
	}*/
	
	public static void  explicit(AndroidElement datas) {
		
		WebDriverWait wait=new WebDriverWait(driver, 17);
		wait.until(ExpectedConditions.visibilityOf(datas));
		
	}
	
public static void  webexplicit(WebElement datas) {
		
		WebDriverWait wait=new WebDriverWait(driver, 17);
		wait.until(ExpectedConditions.visibilityOf(datas));
		
	}
	
	public static void javascriptclick(AndroidElement ele) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);

	}
	
	public static void scrolldown(AndroidElement element) {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	@SuppressWarnings("rawtypes")
	public static void androidscroll() { 

		TouchAction touch =new TouchAction(driver);
		touch.press(PointOption.point(667,2514)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(653,1432)).release().perform();
		touch.press(PointOption.point(672,2048)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(732,1144)).release().perform();
		

		}
	
	public static void usersearch(int i) {
		
		AndroidElement searchdata=driver.findElement(By.xpath("//div["+i+"]//div[2]//div[1]//angular2-multiselect[1]//div[1]//div[2]//div[3]//div[2]//input[1]"));
		searchdata.sendKeys("Midhun tv");
		
		AndroidElement userselect=driver.findElement(By.xpath("//div["+i+"]//div[2]//div[1]//angular2-multiselect[1]//div[1]//div[2]//div[3]//ul[1]//span[1]//li[1]//label[1]"));
		userselect.click();
		
	}
	
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	
	public static String[][] gettestdata(String sheetname,int totalrows,int totalcols) throws IOException{
		
			
			File src=new File(deal);
			FileInputStream file=new FileInputStream(src);		
			HSSFWorkbook book=new HSSFWorkbook(file);	
			sheets=book.getSheet(sheetname);	
			String[][] data=new String[totalrows][totalcols];
			for(int i=0;i<totalrows;i++) {
					
				for(int j=0;j<totalcols;j++) {
				
				data[i][j]=sheets.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);	
				
				}
			 
		}
		
		return data;	
		
	}
	
	public static String[] singledata(String sheetname,int start_column,int totalrows,int totalcols) throws IOException{
		
		
		File src=new File("C:\\Users\\midhun.tv\\Downloads\\data.xlsx");
		FileInputStream file=new FileInputStream(src);		
		XSSFWorkbook book=new XSSFWorkbook(file);	
		sheets=book.getSheet(sheetname);	
		String[] data=new String[totalrows];

			int j=start_column;
			for(int i=0;i<totalrows;i++) {

			data[i]=sheets.getRow(i+1).getCell(j).toString();
			System.out.println(data[i]);
	
			}
		 
	
	return data;
	}
	
   public static ArrayList<String> singledata1(String sheetname,int start_column,int totalrows) throws IOException{
		
		
		File src=new File("C:\\Users\\midhun.tv\\Downloads\\data.xlsx");
		FileInputStream file=new FileInputStream(src);		
		XSSFWorkbook book=new XSSFWorkbook(file);	
		sheets=book.getSheet(sheetname);
		ArrayList<String> ar=new ArrayList<String>();
		
		int j=start_column;
		for(int i=0;i<totalrows;i++) {
			
			ar.add(sheets.getRow(i+1).getCell(j).toString());
		}
		return ar;
	}


	
	public static String[][] anywhere(String sheetname,int startrow,int startcolumn,int totalrows,int totalcols) throws  IOException{
		
		
		File src=new File("C:\\Users\\midhun.tv\\Downloads\\data.xlsx");
		FileInputStream file=new FileInputStream(src);		
		XSSFWorkbook book=new XSSFWorkbook(file);	
		sheets=book.getSheet(sheetname);	
		String[][] data=new String[totalrows-startrow][totalcols-startcolumn];

		final int m=startrow;
		final int n=startcolumn;
		for(int i=startrow;i<totalrows;i++) {

						
			for(int j=startcolumn;j<totalcols;j++) {

			
			data[i-m][j-n]=sheets.getRow(i).getCell(j).toString();
			//System.out.println(m);	
			//System.out.println(n);	
			//System.out.println(data[i-m][j-n]);	
			
			}
		 
	}
	
	return data;	
	
}
}

