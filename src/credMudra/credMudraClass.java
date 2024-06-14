package credMudra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class credMudraClass {
	ChromeDriver driver;
	String url="https://www.credmudra.com/get-registered/user-number?utm_source=CMGS101&utm_medium=CPC&utm_id=CMGS101&utm_campaign=Pmax&1&gad_source=1&gclid=CjwKCAjwyJqzBhBaEiwAWDRJVPnwwokuw5anSziQWrphDY_zahtR7bqvVBZXpjGA2hxuXfjaABpt5xoCgZsQAvD_BwE";
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
	
	public void inputNumber() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id=\"contactNo\"]")).sendKeys("8819071103");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		
	}
	
	public void otpVerification() {
		String dd= driver.getTitle();
		System.out.println(dd);
		
	}

}




