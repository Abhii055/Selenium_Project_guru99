package credMudra;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class credMudraClass {
	ChromeDriver driver;
	String url="https://www.credmudra.com/get-registered/user-number?utm_source=CMGS101&utm_medium=CPC&utm_id=CMGS101&utm_campaign=Pmax&1&gad_source=1&gclid=CjwKCAjwyJqzBhBaEiwAWDRJVPnwwokuw5anSziQWrphDY_zahtR7bqvVBZXpjGA2hxuXfjaABpt5xoCgZsQAvD_BwE";
	
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
	@Test(dependsOnMethods = "invokeBrowser")
	public void inputNumber() {
		driver.navigate().refresh();
		driver.findElement(By.id("contactNo")).sendKeys("8819071103");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
//		driver.findElement(By.xpath("//input[@id='contactNo']")).clear();
//		driver.findElement(By.xpath("//input[@id='contactNo']")).sendKeys("8819071103");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary css-kxe3w7']")).click();
//		driver.navigate().refresh();
	}
	
	
	@Test(dependsOnMethods = "inputNumber")
	public void otpVerification(){
		try {
			Thread.sleep(20000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.className("MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-pbw6n8")).click();

}
}




