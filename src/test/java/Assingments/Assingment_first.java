package Assingments;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingment_first {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle()) ;
		
		//After navigating :Click on Specific Link.
		 driver.findElement(By.id("cab_rental_vertical")).click();
		 
		System.out.println("The Link is succesfully Clicked");
		driver.quit();
		
	}

}
