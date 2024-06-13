package testNG;

import java.time.Duration;	
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class testcaseClass {

	ChromeDriver driver;
	String url="https://www.zappian.com/";
	
	@BeforeMethod
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhin\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}	
	@Test(priority=3,groups="check")
	public void openChrome1() {
		String  title=   driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=1,groups="element")
	public  void openChrome2() {
	String b = driver.findElement(By.xpath("//a[text()='About Us']")).getText();	
	System.out.println(b);
	}
	@Test(priority=2,groups="element")
	public void openChrome3() {
		String a = driver.findElement(By.xpath("//div[@class='footer_menu_div']//a[text()='Career']")).getText();
	System.out.println(a);
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
