package JunitProject_2.JunitProject_2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	
WebDriver driver;	
	
	@Test
	public void ValidLoginTest()
	{
		System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
	    WebDriver driver = new FirefoxDriver();
	    
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.quit();
		
	}
	
	@Test
	public void CurrentURL()
	{
		System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
		WebDriver driver = new FirefoxDriver();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	   
	    String currentURL=driver.getCurrentUrl();
	    Assert.assertTrue(currentURL.contains("index.php/auth/login"));
	    
	  
		
		
	}

}
