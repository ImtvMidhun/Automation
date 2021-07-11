package com.capriconians.utility;

import java.awt.AWTException;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.capriconians.base.baseclass;


public class testutil extends baseclass{
	

	
	//public static WebDriver driver;
	static Sheet sheets;
	static String deal="D:\\apps\\selenium\\Datafile.xls";
	//public static JavascriptExecutor js=(JavascriptExecutor) driver;
	
	/*public testutil(WebDriver driver) {
	
	 this.driver=driver;
	}*/
	
	public static void  explicit(WebElement datas) {
		
		WebDriverWait wait=new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOf(datas));
		
	}
	

	
	public static void  lowexplicit(WebElement data) {
		
		WebDriverWait wait=new WebDriverWait(driver, 03);
		wait.until(ExpectedConditions.visibilityOf(data));
		
	}
	
	public static void javascriptclick(WebElement ele) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);

	}
	
	public static void scrolldown(WebElement element) {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void scrolltoup() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-250)");
		
	}
	
	public static void scrolltodown() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,378)", "");
		
	}
	
	public static void usersearch(int i) {
		
		WebElement searchdata=driver.findElement(By.xpath("//div["+i+"]//div[2]//div[1]//angular2-multiselect[1]//div[1]//div[2]//div[3]//div[2]//input[1]"));
		searchdata.sendKeys("Midhun tv");
		
		WebElement userselect=driver.findElement(By.xpath("//div["+i+"]//div[2]//div[1]//angular2-multiselect[1]//div[1]//div[2]//div[3]//ul[1]//span[1]//li[1]//label[1]"));
		userselect.click();
		
	}
	
	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	
	public static void uploadimage(WebElement proficon,WebElement avatar,WebElement uploadclick,String filelocation,WebElement continueclick,WebElement save) throws InterruptedException, AWTException, IOException {
		
	Thread.sleep(1000);
	testutil.explicit(proficon);
	testutil.javascriptclick(proficon);
	Thread.sleep(1000);
	testutil.explicit(uploadclick);
	testutil.javascriptclick(uploadclick);
	Thread.sleep(1000);
	Runtime.getRuntime().exec("C:\\Users\\midhu\\Documents\\fileupload.exe");
    
    Thread.sleep(1000);
    testutil.scrolldown(continueclick);
    testutil.explicit(continueclick);
    testutil.javascriptclick(continueclick);
    Thread.sleep(1000);
    testutil.scrolldown(save);
    testutil.explicit(save);
    testutil.javascriptclick(save);
    
    testutil.explicit(proficon);
	testutil.javascriptclick(proficon);
	testutil.explicit(avatar);
	testutil.javascriptclick(avatar);
	Thread.sleep(2000);
	testutil.explicit(uploadclick);
	uploadclick.click();
	
System.out.println("block add");
	Thread.sleep(1000);
	Runtime.getRuntime().exec("C:\\Users\\midhu\\Documents\\fileupload.exe");
    
    Thread.sleep(1000);
    testutil.scrolldown(continueclick);
    testutil.explicit(continueclick);
    testutil.javascriptclick(continueclick);
    Thread.sleep(1000);
    testutil.scrolldown(save);
    testutil.explicit(save);
    testutil.javascriptclick(save);
    
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

	/*public static java.util.Map<Integer,List<String>> singledata2(String sheetname,int totalrows,int totalcols) throws InvalidFormatException, IOException{
	
	
		File src=new File("C:\\Users\\midhun.tv\\Downloads\\data.xlsx");
		FileInputStream file=new FileInputStream(src);		
		XSSFWorkbook book=new XSSFWorkbook(file);	
		sheets=book.getSheet(sheetname);
		java.util.Map<Integer,List<String>> map =new HashMap<Integer ,List<String>>();
	
		List<String> ar=new ArrayList<>(totalrows);
	
	
		for(int j=0;j<totalcols;j++) {
		
			for(int i=0;i<totalrows;i++) {
			ar.add(sheets.getRow(i+1).getCell(j).toString());
		
			}
			System.out.println(j);
			map.put(j,ar);
			
		}
		for(String value : map.get(2)) {
			
			System.out.println(value);
			
			}
		System.out.println("------------");
		/*for(String value : map.get(0)) {
			
		System.out.println(value);
		}
	return map;
	}*/
	
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

