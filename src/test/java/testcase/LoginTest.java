package testcase;

import org.testng.annotations.Test;

import baseclass.TestBase;
import pageobjects.LoginPage;

public class LoginTest extends TestBase {
	
	@Test
	public void logintest()
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.clklog();
		lp.entremail("xyz@gmail.com");
		lp.entrpass("12345678");
		lp.clklogin();
		
		
	}

}
