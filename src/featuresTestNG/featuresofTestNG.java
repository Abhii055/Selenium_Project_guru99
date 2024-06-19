package featuresTestNG;




//import java.time.Duration;

import org.testng.annotations.Test;



public class featuresofTestNG {
	

	
	@Test(dependsOnMethods = "close")
	public void login() {
		System.out.println("Login done");
//		int i = 9/0;
	}
	@Test(dependsOnMethods = "close")
	public void HomePage() {
		System.out.println("Home Page loaded");
	}
	@Test(dependsOnMethods = "close")
	public void chatPage() {
		System.out.println("Chat page is working fine");
	}
	@Test(dependsOnMethods = "close")
	public void messagePage() {
		System.out.println("Message sent to the respective users");
	}
	@Test(dependsOnMethods = "messageppage")
	public void close() {
		System.out.println("working finished");
	}
	@Test(invocationCount = 5)
	public void messageppage() {
		
		System.out.println("Message sent to the respective users");
	}
}





//ChromeDriver driver;
//String url ="https://www.garenaff.com";

//@BeforeTest
//public void invokeBrowser() {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhin\\eclipse-workspace\\libs\\chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
//	driver.get(url);	
//}
//@AfterTest
//public void closeBrowser() {
//	driver.close();
//}