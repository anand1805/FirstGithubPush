package TestExample.FirstMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeExample {
	WebDriver driver;
/*	@BeforeSuite
	private void beforeTest() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();*/
		

	
	@Test
	public void exampleOne() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.keybr.com/");

	}
	@Test
	public void exampleTwo() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
driver.get("http://total-qa.com/steps-launch-chromebrowser-without-using-chromedriver-exe/");

	}
/*	@AfterSuite
	public void afterExample() {
		driver.get("https://www.google.com/");
		

	}*/

}
