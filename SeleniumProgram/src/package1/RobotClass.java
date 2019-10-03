package package1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotClass {
	 @Test
	 public void TestRobo()throws Exception
	 {
	  // Open Firefox
	 System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	                
	  // Maximize the window
	  driver.manage().window().maximize();
	 
	  // Open facebook
	  driver.get("http://www.facebook.com");
	 
	  // Enter Username
	  driver.findElement(By.id("email")).sendKeys("Selenium@gmail.com");
	 
	  // Enter password
	  driver.findElement(By.id("pass")).sendKeys("mukesh");
	 
	  // Create object of Robot class
	  Robot r=new Robot();
	 
	   // Press Enter
	   r.keyPress(KeyEvent.VK_ENTER);
	 
	   // Release Enter
	   r.keyRelease(KeyEvent.VK_ENTER);
	                  
	}
	 
	}

