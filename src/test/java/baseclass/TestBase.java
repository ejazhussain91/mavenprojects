package baseclass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public ResourceBundle rb;
	public Logger logger;
	public static WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	{
		rb=ResourceBundle.getBundle("file");
		logger=LogManager.getLogger(this.getClass());
		WebDriverManager.chromedriver().setup();
		if(br.equals("firefox"))
		{
		driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(rb.getString("appurl"));
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
	
	public  String generaterandonalphabet()
	{
		String generatedalphabaet=RandomStringUtils.randomAlphabetic(5);
		return generatedalphabaet; 
	}
	
	public  String generaterandomnumeric()
	{
		String randomnumeric=RandomStringUtils.randomNumeric(8);
		return randomnumeric;
	}
	
	public  String generaterandomalphanumeric()
	{
		String randomalphanumeric=RandomStringUtils.randomAlphanumeric(4);
		return randomalphanumeric;
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;

}}
