package POManager;

import org.openqa.selenium.WebDriver;

import com.pom.Book_Hotel;
import com.pom.Conform_Booking;
import com.pom.Home_page;
import com.pom.Log_Out;
import com.pom.Search_Hotel;
import com.pom.Select;

public class Po_Manager {
	public WebDriver driver;
	private Home_page hp;
	private Search_Hotel sh;
	private Select s;
	private Book_Hotel bh;
	private Conform_Booking cb;
	private Log_Out lo;
	

	public Po_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	public Home_page gethp() {
		if (hp==null) {
			hp = new Home_page(driver);
		}
      return hp;
	}
	public Search_Hotel getsh() {
		if (sh==null) {
			sh = new Search_Hotel(driver);
		}
		return sh;

	}
	public Select gets() {
		if (s==null) {
			s = new Select(driver);
		}
        return s;
	}
	public Book_Hotel getbh() {
		if (bh==null) {
			bh = new Book_Hotel(driver);
		}
         return bh;
	}
	public Conform_Booking getcb() {
		if (cb==null) {
			cb = new Conform_Booking(driver);
		}
		return cb;

	}
	public Log_Out getlo() {
       if (lo==null) {
    	    lo = new Log_Out(driver);
	}
         return lo;
	}
}
