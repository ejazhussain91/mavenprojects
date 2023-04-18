package testcase;

import org.testng.annotations.Test;

import baseclass.TestBase;
import pageobjects.RegisterPage;

public class Registertest extends TestBase {
	
	@Test
	public void registerform()
	
	{
	
	RegisterPage rp=new RegisterPage(driver);
	rp.clickbutton();
	rp.enterfname(generaterandonalphabet());
	rp.enterlname(generaterandonalphabet());
  rp.enteremail(generaterandonalphabet()+"@gmail.com");
  rp.entercomp("softwaretesting");
 // rp.clicknewsletter();
  rp.enterpassword("12345678");
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
	}
}
