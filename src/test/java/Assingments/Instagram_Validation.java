package Assingments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Instagram_Validation {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		
		//verifying if element is displayed
		boolean isElementdisplayed=driver.findElement(By.xpath("//*[text()='Log in with Facebook']")).isDisplayed();
		Assert.assertTrue(isElementdisplayed,"The Element is not displayed on signup page");
		
		boolean isElementDisabled=driver.findElement(By.xpath("//*[text()='Sign Up']")).isEnabled();
		Assert.assertFalse(isElementDisabled,"The element should not be enabled");
		
		driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("9271700756");
		driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Niraj Pawar");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Niraj123");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8883294837");
		
		boolean isElementEnabled=driver.findElement(By.xpath("//*[text()='Sign Up']")).isEnabled();
		Assert.assertTrue(isElementEnabled,"The element is disabled");
		
		
		
		
	}
	
}
