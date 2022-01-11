package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public static WebDriver driver;
	@FindBy(xpath="//*[@name='first_name']")
	private WebElement fname;
	
	@FindBy(xpath="//*[@name='last_name']")
	private WebElement lname;
	
	@FindBy(xpath="//*[@name='address']")
	private WebElement Address;
	
	@FindBy(xpath="//*[@name='cc_num']")
	private WebElement ccnum;
	
	@FindBy(xpath="//*[@name='cc_type']")
	private WebElement cctype;
	
	@FindBy(xpath="//*[@name='cc_exp_month']")
	private WebElement ccexpm;
	
	@FindBy(xpath="//*[@name='cc_exp_year']")
	private WebElement ccexpy;
	
	@FindBy(xpath="//*[@name='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath="//*[@name='book_now']")
	private WebElement booknow;

	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpm() {
		return ccexpm;
	}

	public WebElement getCcexpy() {
		return ccexpy;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

}
