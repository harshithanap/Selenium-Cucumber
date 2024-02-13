package tests;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.testng.annotations.BeforeTest; 
import pages.Base; 
import pages.HomePage; 
import pages.LoginPage; 

import org.testng.annotations.Test;


public class TestLogin extends Base {
	
	WebDriver d; 
	HomePage h; 
	LoginPage l; 
	@Test
	public void testLogin() { 

	h.clickLoginLink(); 

	l.enterLoginDetails("Itest@test.com","Itest@test"); 

	 } 
	@BeforeTest() 
	public void setup() { getBrowser(); 

	h=new HomePage(); 

	l= new LoginPage();
	}
	}



  
