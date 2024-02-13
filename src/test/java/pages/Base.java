package pages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 


public class Base {
	
public static WebDriver driver = null; 
public static void getBrowser() 
	 { 
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Practice Exercises\\Selenium - S2\\PS-1-POMFramwork\\src\\test\\resources\\drivers\\windows\\chromedriver.exe"); 
	driver = new ChromeDriver(); 
	driver.manage().window().maximize(); 

	driver.manage().deleteAllCookies(); 

	driver.get("https://demowebshop.tricentis.com/");
	 }


}
