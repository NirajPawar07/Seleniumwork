package Webscenarios;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Jarvis.Utility;

public class NewaccountFacebook {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Whisky");
		driver.findElement(By.name("lastname")).sendKeys("Pawar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9271700756");
		driver.findElement(By.id("password_step_input")).sendKeys("9271700756");
		
		WebElement datele=driver.findElement(By.id("day"));
		Utility.SelectBaseddropdown(datele, "14");
		
		WebElement monele=driver.findElement(By.id("month"));
		Utility.SelectBaseddropdown(monele, "Jan");
		
		WebElement yearele=driver.findElement(By.id("year"));
		Utility.SelectBaseddropdown(yearele, "2002");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
        
        
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
		

	}

}
