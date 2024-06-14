package assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import dev.failsafe.internal.util.Assert;

public class validation {

	ChromeDriver driver;
	String url ="https://www.google.com";
	
	@BeforeMethod
	public void invokeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhin\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	@Test
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	assertEquals(title,"Google","Given Title is not matched with the title  we are getting from  the function");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
