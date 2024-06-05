package firstSeleniumScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;

	public void invokeBrowser() {
		String url = "https://test.qatechhub.com";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhin\\eclipse-workspace\\libs\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url);
	}

	public void printTitle() {
		String expectedTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.print("PASS");
		} else {
			System.out.print("FAIL");
		}

	}
	public void navigateCommands() {
		driver.get("https://www.facebook.com");
		driver.navigate().back();
		String urlofCurrentWeb= driver.getCurrentUrl();
		System.out.println(urlofCurrentWeb);
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public void closeBrowser() {
		driver.quit(); // to close all windows
	}

	public static void main(String[] args) {
		WorkingWithChrome wc = new WorkingWithChrome();
		wc.invokeBrowser();
		wc.printTitle();
		wc.navigateCommands();
		wc.closeBrowser();
	}
}

//User ID :	mngr575227
//Password :	EjazEde
