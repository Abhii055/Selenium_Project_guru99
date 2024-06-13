package featuresTestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



public class featuresofTestNG {
	
	ChromeDriver driver;
	String url = "https://ff.garena.com/en/";
	
	@Test
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhin\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		System.out.println("invoking is done");
	}
	
	@Test(dependsOnMethods ="invokeBrowser")
	public void login() {
		System.out.println("Login done");
//		int i = 9/0;
	}
	@Test(dependsOnMethods = "login")
	public void HomePage() {
		System.out.println("Home Page loaded");
	}
	@Test(dependsOnMethods = "login")
	public void chatPage() {
		System.out.println("Chat page is working fine");
//		int j =8/0;
	}
	@Test(dependsOnMethods = "login")
	public void messagePage() {
		System.out.println("Message sent to the respective users");
	}
}
