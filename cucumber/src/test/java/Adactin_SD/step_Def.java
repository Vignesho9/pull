package Adactin_SD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.Base_Class;
import com.v.Po_Manager;

import Adactin_Runner.Runner;
import Helper.File_Reader_Manager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_Def extends Base_Class {
	public static WebDriver driver = Runner.driver;
	public static Po_Manager pom = new Po_Manager(driver);

	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		get(url);
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	   inputvalues(pom.gethp().getemail(), "vignesho9");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
	   inputvalues(pom.gethp().getPassword(), "393FT3");
	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	   click(pom.gethp().getLogin());
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		select("index",pom.getsh().getLocation(), "7");
	}

	@When("^user Select The Hotels$")
	public void user_Select_The_Hotels() throws Throwable {
		select("index",pom.getsh().getHotel(), "2");
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		select("index",pom.getsh().getRoom(), "2");
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
	   
	}

	@When("^user Select The Check In Date$")
	public void user_Select_The_Check_In_Date() throws Throwable {
		clear(pom.getsh().getChi());
		inputvalues(pom.getsh().getChi(), "09/12/2021");
	}

	@When("^user Select The Check Out Date$")
	public void user_Select_The_Check_Out_Date() throws Throwable {
		clear(pom.getsh().getCho());
		inputvalues(pom.getsh().getCho(), "18/12/2021");
	}

	@When("^user Select The Adults Per Room$")
	public void user_Select_The_Adults_Per_Room() throws Throwable {
		select("index",pom.getsh().getAdultroom(), "2");
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
	   
	}

	@Then("^user Click The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		click(pom.getsh().getSubmit());
	}

	@When("^user Click On The Select Button$")
	public void user_Click_On_The_Select_Button() throws Throwable {
		click(pom.gets().getRadio());
	}

	@Then("^user Click On The Continue Button And It Navigates To The Book Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
		click(pom.gets().getContinu());
	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		inputvalues(pom.getbh().getFname(), "Vignesh");
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		inputvalues(pom.getbh().getLname(), "Pandiyan");
	}

	@When("^user Enter The Billing Address$")
	public void user_Enter_The_Billing_Address() throws Throwable {
		inputvalues(pom.getbh().getAddress(), "09 vignesh street palur trichy 621216");
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		inputvalues(pom.getbh().getCcnum(), "8012228005998877");
	}

	@When("^user Enter The Credit Card Type$")
	public void user_Enter_The_Credit_Card_Type() throws Throwable {
		select("index",pom.getbh().getCctype(), "2");
	}

	@When("^user Enter The Expiry Date Month$")
	public void user_Enter_The_Expiry_Date_Month() throws Throwable {
		  select("index",pom.getbh().getCcexpm(), "6"); 
	}

	@When("^user Enter The Expiry Date Year$")
	public void user_Enter_The_Expiry_Date_Year() throws Throwable {
		  select("index",pom.getbh().getCcexpy(), "8");
	}

	@When("^user Enter The Cvv Number$")
	public void user_Enter_The_Cvv_Number() throws Throwable {
		 inputvalues(pom.getbh().getCvv(), "123");
	}

	@Then("^user Click On The Book Now Button And It Navigates To The Booking Conform Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Conform_Page() throws Throwable {
		click(pom.getbh().getBooknow());
		 WebDriverWait wait = new WebDriverWait(driver,30);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='my_itinerary']")));

	}

	@Then("^user Click On The Logout Button And It Navigates To The Home Page$")
	public void user_Click_On_The_Logout_Button_And_It_Navigates_To_The_Home_Page() throws Throwable {
		 click(pom.getlo().getSign_Out());
	}



}
