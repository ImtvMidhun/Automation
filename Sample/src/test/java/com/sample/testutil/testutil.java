package com.sample.testutil;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sample.base.base;



public class testutil extends base {
	
	static String file="C:\\Users\\midhu\\eclipse-workspace\\interview\\src\\test\\java\\com\\interview\\testutil\\amazon1.xls";
	public static JavascriptExecutor  jk=(JavascriptExecutor) driver;
	static Sheet sheetdata;
	
	public static void callwait(WebElement pass) {
		
	WebDriverWait ok=new WebDriverWait(driver, 15);
	ok.until(ExpectedConditions.visibilityOf(pass));
			
	}
	
	public static void javascriptclick(WebElement one) {
		
		
		
		jk.executeScript("arguments[0].click();", one);
			
		
	}
	
	public static void scrolldownele(WebElement sc) {
		
		jk.executeScript("arguments[0].scrollIntoView(true);", sc);
		
	}
	
	public static void screenshot(String filename) throws IOException {
		
		File filed=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(filed, new File("C:\\Users\\midhu\\git\\Automation\\Capriconians\\test-output"+filename+".jpg"));
	}
	
	public static String[][] getdata(String sheetname,int lastrow,int lastcolumn) throws IOException {
		
		
		File src=new File(file);
		FileInputStream fs=new FileInputStream(src);
		HSSFWorkbook book=new HSSFWorkbook(fs);
		sheetdata=book.getSheet(sheetname);

		String[][] value=new String[lastrow][lastcolumn];
		
		for(int i=0;i<lastrow;i++) {
			
			for(int j=0;j<lastcolumn;j++) {
				
				value[i][j]=sheetdata.getRow(i+1).getCell(j).toString();
				System.out.println(value[i][j]);
				
				
				
			}
		}
		
		return value;
		
		
		
	}

}
