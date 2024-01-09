package Webscenarios;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Jarvis.BootstrapDropDown;

public class FromToDropdown {

	public static void main(String[] args)
	{
	   ChromeOptions options=new ChromeOptions();
	   options.addArguments("--disable-notifications");
	   
	   WebDriver driver=new ChromeDriver(options);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.get("https://www.goibibo.com/");
	   System.out.println("The Tittle is: "+driver.getTitle());
	   
	   driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	   
	   driver.findElement(By.xpath("(//div[@class='sc-12foipm-34 iHoHRr'])[1]")).click();
	   driver.findElement(By.xpath("//div[@class='sc-12foipm-38 dAUhfz']//input[@type='text']")).sendKeys("Pune");
	   
	   List<WebElement>fromele=driver.findElements(By.xpath("//li[@role='presentation']"));
	   BootstrapDropDown.BootstrapDropDown(fromele,"Mumbai");
	   
	   driver.findElement(By.xpath("(//div[@class='sc-12foipm-34 iHoHRr'])[2]")).click();
	   driver.findElement(By.xpath("(//div[@class='sc-12foipm-34 iHoHRr'])[2]")).sendKeys("goa");
	   
	   List<WebElement>toele=driver.findElements(By.xpath("//li[@role=\"presentation\"]"));
	   BootstrapDropDown.BootstrapDropDown(toele,"kolaphur" );
	   
	  
	   
	   
	   
	   

	}

}
