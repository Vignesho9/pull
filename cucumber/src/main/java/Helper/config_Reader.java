package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class config_Reader {
	public static Properties p;
	public config_Reader() throws Throwable{
	File f = new File("C:\\Users\\Vignesh\\git\\viki\\Mini_Projects\\src\\main\\java\\com\\Properties\\configuration.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
	}
	public String getUrl(){
	String url = p.getProperty("url");
	return url;
	}
	public String getUsername(){
	String username = p.getProperty("username");
	return username;
	}
	public String getPassword(){
		String password = p.getProperty("password");
		return password;
		}
	public String getFname(){
		String fname = p.getProperty("fname");
		return fname;
		}
	public String getLname(){
		String lname = p.getProperty("lname");
		return lname;
		}
	public String getAddress(){
		String address = p.getProperty("address");
		return address;
		}
	public String getCreditcard(){
		String creditcard = p.getProperty("creditcardno");
		return creditcard;
		}
	public String getCvv(){
		String cvv = p.getProperty("cvv");
		return cvv;
		}
	}


