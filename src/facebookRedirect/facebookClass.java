package facebookRedirect;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebookClass {

	ChromeDriver driver;
	String url ="https://www.fb.com";
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhin\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.navigate().to(url);
	}
	public void verifyingUrl() {
		String currentURL = driver.getCurrentUrl();
		if(url.equals(currentURL)) {
			System.out.print("PASS");
		}
		else {
			System.out.print("FAIL");
		}
	}
	public void CAFR() {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-testid='open-registration-form-button']")));
         // Perform action on the element
         element.click();
	}
	public void CA(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));
        element.sendKeys("test");
//		driver.findElement(By.name("firstname")).sendKeys("abhinav");
		driver.findElement(By.name("lastname")).sendKeys("dwivedi");
		String emaiurl = "test"+System.currentTimeMillis()+"@hichka.com";
		driver.findElement(By.name("reg_email__")).sendKeys(emaiurl);
		////input[@name='reg_email_confirmation__']
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement emailelement = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='reg_email_confirmation__']")));
        emailelement.sendKeys(emaiurl);
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Hichka");
//		Select selDate = new Select(driver.findElement(By.id("day")));
		
		WebElement selDate = driver.findElement(By.id("day"));
		Select dropday = new Select(selDate);
		dropday.selectByVisibleText("21");
		
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		
		
		selMonth.selectByVisibleText("Jun");
		selYear.selectByVisibleText("1989");
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();		
		
	}
}
