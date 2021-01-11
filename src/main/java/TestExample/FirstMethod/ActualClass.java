package TestExample.FirstMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActualClass extends BaseClass{
	String oldwindow;
	@Test
	public void findElement1() {
	Reporter.log("click the signup button");
	WebElement a=	driver.findElement(By.id("signin2"));
	String oldwindow=driver.getWindowHandle();
	a.click();
	
	
	Set<String> newwindow=	driver.getWindowHandles();
	for (String nextwindow : newwindow) {
		driver.switchTo().window(nextwindow);
		
	}
		Reporter.log("enter the username and password");
	WebElement b=	driver.findElement(By.xpath("//*[@id=\"sign-username\"]"));
	b.sendKeys("anand2118");
	WebElement c=driver.findElement(By.xpath("//*[@id=\"sign-password\"]"));
	c.sendKeys("monika2118");
	driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
	
	}
	
	

}
