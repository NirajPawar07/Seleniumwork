package Webscenarios;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Jarvis.Utility;

public class amazon {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		System.out.println("The Tittle is: "+driver.getTitle());
		
		WebElement proele=driver.findElement(By.id("searchDropdownBox"));
		Utility.SelectBaseddropdown(proele, "Alexa Skills");
		

	}

}
