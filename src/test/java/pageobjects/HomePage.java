package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
		
public HomePage(WebDriver driver) {
		super(driver);
		
	}

@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")WebElement register;
	
	public void clickReg()
	{
		register.click();
	}

}
