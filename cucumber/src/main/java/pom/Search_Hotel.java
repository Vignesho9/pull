package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public static WebDriver driver;
	@FindBy(xpath="//*[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//*[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//*[@name='room_type']")
	private WebElement room;
	
	@FindBy(xpath="//*[@name='datepick_in']")
	private WebElement chi;
	
	@FindBy(xpath="//*[@name='datepick_out']")
	private WebElement cho;
	
	@FindBy(xpath="//*[@name='adult_room']")
	private WebElement adultroom;
	
	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getChi() {
		return chi;
	}

	public WebElement getCho() {
		return cho;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(xpath="//*[@name='Submit']")
	private WebElement submit;
	
        
}
