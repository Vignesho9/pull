package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conform_Booking {
	public static WebDriver driver;
	@FindBy(xpath="//input[@id='my_itinerary']")
	private WebElement itey;

	public Conform_Booking(WebDriver driver2) {
	    this.driver = driver2;
	    PageFactory.initElements(driver, this);
	}

	public WebElement getItey() {
		return itey;
	}

}
