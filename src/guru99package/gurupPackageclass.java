package guru99package;

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;
//	import org.testng.annotations.Test;
	
	import com.github.javafaker.Faker;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import java.time.Duration;

public class gurupPackageclass {
	ChromeDriver driver;
	String url ="https://demo.guru99.com/v4/";
	
	public void invokeBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhin\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get(url);
	}

	public void inputData(String username, String password) 
	{
		WebElement usernameElement= driver.findElement(By.name("uid"));
		usernameElement.sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addUser() {
		driver.findElement(By.linkText("New Customer")).click();
		Faker faker = new Faker();
		String name = faker.name().firstName();
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("name")));
		
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.xpath("//input[@value='f']")).click();
		driver.findElement(By.name("dob")).sendKeys("09/09/2001");
		driver.findElement(By.name("addr")).sendKeys("hichka hichka homes");
		driver.findElement(By.name("city")).sendKeys("Hicka Alaska");
		driver.findElement(By.name("state")).sendKeys("USA");
		driver.findElement(By.name("pinno")).sendKeys("4620000020");
		driver.findElement(By.name("telephoneno")).sendKeys("12340000");
		String email = "test"+System.currentTimeMillis()+"@gmail.com";
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys("Hichka");
		driver.findElement(By.name("sub")).click();
	}
	
	public String getCustomerId() {
		return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
	}
	
	public void closeTheBrowser() 
	{
//		driver.navigate().refresh();
		String currentUrl = driver.getCurrentUrl();
		System.out.print(currentUrl);
//		driver.close();
		
	}
}
