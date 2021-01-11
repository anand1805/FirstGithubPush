package TestExample.FirstMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	WebDriver driver;
	@Test
	public void classOne() {
		WebDriverManager.firefoxdriver().setup();
	WebDriver	driver =new FirefoxDriver();
	driver.get("https://mvnrepository.com/artifact/com.beust/jcommander/1.27");
	driver.quit();

	}
	@Test(dependsOnMethods="ClassOne")
	public void methodTwo() throws InterruptedException {
		System.out.println("testng successful");
		Thread.sleep(3000);

	}
    @Test(dependsOnMethods="methodTwo")
    public void methodThree() {
    	WebDriverManager.firefoxdriver().setup();
    	WebDriver	driver =new FirefoxDriver();
	driver.get("https://stackoverflow.com/questions/31384826/testng-option-not-showing-in-runas-option-in-eclipse/31386181");

	}
    @Test(dependsOnMethods="methodThree")
	public void methodFour()  {
		System.out.println("testng successful");

    }
}
