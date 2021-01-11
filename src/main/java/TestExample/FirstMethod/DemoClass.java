package TestExample.FirstMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass {
	WebDriver driver;
	@Test
	public void demoOne() {
  WebDriverManager.firefoxdriver().setup();
  driver=new FirefoxDriver();
  driver.get("https://www.keybr.com/");
  

	}

}
