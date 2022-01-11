package com.cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	private static String value;
	public static WebDriver browserlaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//Driver//chromedriver.exe");
            driver = new ChromeDriver();
			}
		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			driver = new FirefoxDriver();
			
		}

          driver.manage().window().maximize();
          return driver;
	}
        public static void get(String url) {
           driver.get(url);
		
		
		}
        public static void inputvalues(WebElement element, String values) {
        	element.sendKeys(values);
			}
        public static void click(WebElement element) {
        	element.click();
        }
        public static void select(String type, WebElement element, String value) {
        	Select s = new Select(element);
        if (type.equalsIgnoreCase("index")) 
		    s.selectByIndex(Integer.parseInt(value));	
		    if (type.equalsIgnoreCase("value")) 
		    	s.deselectByValue(value);
		    if (type.equalsIgnoreCase("text"))
		    	s.deselectByVisibleText(value);
				
        }
        
        public static String perticular_Data(String path,int row,int cell) throws Throwable {
            File f = new File(path);
            FileInputStream fis = new FileInputStream(f);
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sheetAt = wb.getSheetAt(0);
            Row r = sheetAt.getRow(row);
            Cell c = r.getCell(cell);
            CellType cellType = c.getCellType();
            if (cellType.equals(cellType.STRING)) {
				 value = c.getStringCellValue();
			}
            else if (cellType.equals(cellType.NUMERIC)) {
				double cellValue = c.getNumericCellValue();
				int val = (int) cellValue;
				value = String.valueOf(val);
			}
            return value;
		}
        public static  void clear(WebElement element) {
        	element.clear();
		}
       

		
         public static void backSpace() throws AWTException {
        	 Robot r = new Robot();
        	 r.keyPress(KeyEvent.VK_BACK_SPACE);
        	 r.keyRelease(KeyEvent.VK_BACK_SPACE);
        	 
         }
         public static void sleep(int sec) throws InterruptedException {
		 Thread.sleep(sec);
         }
          public static void waitt() {
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  }
          private void scrollElementView(WebElement element) {
        	  JavascriptExecutor js =  (JavascriptExecutor) driver;
        	  js.executeScript("arguments[0].scrollIntoview();", element);
			
        	 

		}
          private void mouseActions(String type, WebElement element) {
        	  Actions a = new Actions(driver);
        	  if(type.equalsIgnoreCase("move"))
        		  a.moveToElement(element).perform();
        	  
        	  if(type.equalsIgnoreCase("rightclick"))
        		  a.contextClick(element).perform();
        	  
        	  if(type.equalsIgnoreCase("doubleclick"))
        		  a.doubleClick(element).perform();
        	  
        	  if(type.equalsIgnoreCase("leftclick"))
        		  a.click(element).perform();

		}
}
