package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select {
	public static WebDriver driver;
	@FindBy(xpath="//*[@name='radiobutton_0']")
	private WebElement radio;
	
	@FindBy(xpath="//*[@name='continue']")
	private WebElement continu;

	public Select(WebDriver driver2) {
    this.driver = driver2;
    PageFactory.initElements(driver, this);
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinu() {
		return continu;
	}
}
