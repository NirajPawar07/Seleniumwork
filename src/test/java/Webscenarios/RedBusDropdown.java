package Webscenarios;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusDropdown {

	public static void main(String[] args) 
	{
		 ChromeOptions Options=new ChromeOptions();
		   Options.addArguments("--disable-notifications");
		   
	   WebDriver driver=new ChromeDriver(Options);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	   
	   driver.get("https://www.redbus.in/");
	   
	   WebElement fromele=driver.findElement(By.id("src"));
	   fromele.click();
	   fromele.sendKeys("pun");
	   
	    List<WebElement>list1=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
	    System.out.println("The Total options are: "+list1.size());
	    
	    
	    for(WebElement i:list1)
	    {
	    	System.out.println(i.getText());
	    	
	    	if(i.getText().contains("Bhosari"));
	    	{
	    		i.click();
	    	   break;
	    	}
	    	 
	    	 
	    }
	    

	}

}
