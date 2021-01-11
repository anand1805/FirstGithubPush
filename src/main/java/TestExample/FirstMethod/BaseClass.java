package TestExample.FirstMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
 
	@BeforeClass
	public void setupApplication() {
		Reporter.log("launch chrome browser");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.demoblaze.com/#");
	}
	@AfterClass
	public void closeBrowser() throws InterruptedException {
	  Reporter.log("close the browser");
	  Thread.sleep(3000);
	  driver.quit();

	}
}
