package testcase;


import org.testng.annotations.Test;

import baseclass.TestBase;
import pageobjects.HomePage;
import pageobjects.RegisterPage;

public class HomeTest extends TestBase {
	
	@Test(priority=1)

	public void regtest()
	{
		logger.info("regtest is in progresss");
		HomePage hm=new HomePage(driver);
		hm.clickReg();
		logger.info("regtest is completed");
		
		
		logger.info("regtestform is in progresss");
		RegisterPage rp=new RegisterPage(driver);
		rp.clickbutton();
		rp.enterfname(generaterandonalphabet());
		rp.enterlname(generaterandonalphabet());
	  rp.enteremail(generaterandonalphabet()+"@gmail.com");
	  rp.entercomp("softwaretesting");
	 // rp.clicknewsletter();
	  rp.enterpassword("1234567");
	  rp.enterconfirmpassword("12345678");
	  rp.clickregbutton();
	 
	   String message=rp.checkstatus();
	   if(message.equals("Your registration completed"))
	   {
		   System.out.println("passed");
	   }else
	   {
		   System.out.println("Failed"); 
	   }
	   rp.clickcontinue();
	   logger.info("regtestform is in completed");
	}

}
