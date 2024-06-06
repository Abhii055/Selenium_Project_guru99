package mouseOperations;

import java.time.Duration;
//import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartProject {
	ChromeDriver driver;
	String url="https://flipkart.com";
	public void invokeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhin\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	public void MouseHover() {
		WebElement electronicElement = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions action =new Actions(driver);
		action.moveToElement(electronicElement).build().perform();
		WebElement Gaming = driver.findElement(By.xpath("//a[text()='Gaming']"));
		action.moveToElement(Gaming).click().build().perform();
	}
	public static void main(String[] args) {
		FlipkartProject fp = new FlipkartProject();
		fp.invokeBrowser();
		fp.MouseHover();
	}
}
