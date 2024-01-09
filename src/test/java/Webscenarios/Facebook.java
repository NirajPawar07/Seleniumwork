package Webscenarios;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.linkText("Create new account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Whisky");
	    driver.findElement(By.name("lastname")).sendKeys("Rio");
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9271700756");
	    driver.findElement(By.id("password_step_input")).sendKeys("CH_Whisky07");
	    
	    WebElement dy=driver.findElement(By.id("day"));
	    Select dd1=new Select(dy);
	    dd1.selectByValue("14");
	    
	    WebElement mn=driver.findElement(By.name("birthday_month"));
	    Select dd2=new Select(mn);
	    dd2.selectByVisibleText("Jan");
	    
	    WebElement yr=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	    Select dd3=new Select(yr);
	    dd3.selectByIndex(7);
	    
	    //driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	    
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    		
	    
	    
	    
		

	}

}
