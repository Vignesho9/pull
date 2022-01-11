package Adactin_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


 @RunWith(Cucumber.class)
 @CucumberOptions(features="src\\test\\java\\Adactin_Feature\\Adactin.feature",
            glue = "Adactin_SD",
            monochrome = true,
            dryRun = false,
            strict = true,
            plugin= {
            		"html:report/Html_Report",
            		"pretty",
            		"json:report/Jsonreport.json",
            		"com.cucumber.listener.ExtentCucumberFormatter:Extentreport/extentreport.htmld"
            		
            		
            }
    
		 
		 
		 
		 )
public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void Set_Up() {
		
		driver =  Base_Class.browserlaunch("chrome");

	}
	@AfterClass
	public static void tear_Down() {
		
		driver.close();
		

	}

}
