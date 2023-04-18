package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")WebElement log;
	@FindBy(xpath="//*[@id=\"Email\"]")WebElement email;
	@FindBy(name="Password")WebElement pass;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")WebElement login;
	
	public void clklog()
	{
		log.click();
	}
	public void entremail(String emal)
	{
	   email.sendKeys(emal);	
	}
	public void entrpass(String passw)
	{
		pass.sendKeys(passw);
	}
	public void clklogin()
	{
		login.click();
	}

}
