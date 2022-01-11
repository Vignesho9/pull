package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_Out {
	public static WebDriver driver;
    
	@FindBy(xpath="//input[@id='logout']")
	private WebElement Sign_Out;

	
     public Log_Out(WebDriver driver2) {
    	 this.driver=driver2;
    	 PageFactory.initElements(driver, this);
	}

     
     
     public WebElement getSign_Out() {
		return Sign_Out;
	}
}
