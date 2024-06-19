
package usPackage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class usPackageclass {
ChromeDriver driver;
String url="https://newdocuments.dataporter.us/login";

@Test
public void invokeBrowser() 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhin\\eclipse-workspace\\libs\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(url);
}
@Test(invocationCount = 5,dependsOnMethods = "invokeBrowser")
public void fillingDetails() {
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vaibhav.dwivedi@biz4solutions.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vaibhav12345");
	driver.navigate().refresh();
}
@Test(dependsOnMethods ="fillingDetails")
public void close() {
	driver.close();
}
//public void login() {
//	driver.findElement(By.xpath("//span[text()='Login']")).click();
//}
}
