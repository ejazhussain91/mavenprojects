package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"gender-male\"] ")WebElement button; 
	@FindBy(xpath="//*[@id=\"FirstName\"]")WebElement fname; 
	@FindBy(xpath="//*[@id=\"LastName\"]")WebElement lname; 
	@FindBy(name="DateofBirthDay")WebElement dob; 
	@FindBy(name="DateofBirthMonth")WebElement dom; 
	@FindBy(name="DateofBirthYear")WebElement doy; 
	@FindBy(name="Email")WebElement email; 
	@FindBy(name="Company")WebElement comp; 
	@FindBy(name="Newsletter")WebElement nletter;
	@FindBy(name="Password")WebElement password;
	@FindBy(name="ConfirmPassword")WebElement cnfpass;
	@FindBy(name="register-button")WebElement regbutton;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")WebElement status; 
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")WebElement continues; 
	public void clickbutton()
	{
		button.click();
	}
	public void enterfname(String name)
	{
		fname.sendKeys(name);
	}
	public void enterlname(String laname)
	{
	 lname.sendKeys(laname);	
	}
	public void enteremail(String emal)
	{
		email.sendKeys(emal);
	}
	public void entercomp(String cmpname)
	{
		comp.sendKeys(cmpname);
	}
	public void clicknewsletter()
	{
		nletter.click();
	}
	public void enterpassword(String paasw)
	{
		password.sendKeys(paasw);
	}
	public void enterconfirmpassword(String passw)
	{
		cnfpass.sendKeys(passw);
	}
	public void clickregbutton()
	{
		regbutton.click();
	}
	public String checkstatus()
	{
		try {
		return status.getText();
		}catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	
	public void clickcontinue()
	{
		continues.click();
	}

	
	
	
	
	
	
	

}
