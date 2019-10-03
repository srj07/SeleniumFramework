package package1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoItDemo {

	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		AutoClass();
	}
	
	public static void AutoClass() throws IOException, InterruptedException{
		  System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://www.tinyupload.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		
		WebElement ele = driver.findElement(By.xpath("//input[@name='uploaded_file']"));
		ele.click();
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		
		WebElement ele1 = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/img"));
		ele1.click();

		Thread.sleep(3000);
	}
	
}
