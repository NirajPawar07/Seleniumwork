package WaitClasses;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitWebdriver {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		By email=By.id("input-email");
		By password=By.name("password");
		By btn=By.xpath("//input[@class='btn btn-primary']");
		
		
		//Explicit.WebdriverWait:
		WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement ele=obj.until(ExpectedConditions.presenceOfElementLocated(email));
		
		ele.sendKeys("Test@gmail.com");
		
		WebDriverWait passobj=new WebDriverWait(driver,Duration.ofSeconds(5));
		passobj.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys("test@123");
		
		WebDriverWait btnobj=new WebDriverWait(driver,Duration.ofSeconds(5));
		btnobj.until(ExpectedConditions.elementToBeClickable(btn)).click();
		
		

	}

}
