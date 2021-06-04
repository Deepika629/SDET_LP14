package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class AnnotationsBeforeAfter {
	
	public static WebDriver driver;
	
	@Before
	public void driverInitialization()
	{
		System.setProperty("webdriver.chrome.driver" , "C:\\Drivers\\chromedriver.exe");
		System.out.println("Before scenario");
		driver= new ChromeDriver();
		
	}
	
	@After
	public void driverClose()
	{
		driver.quit();
		
	}
	
	
}
