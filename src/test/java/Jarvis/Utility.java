package Jarvis;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	
	//WebDriverWait()=Explicit Wait
	
		public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
		{
			WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
			return obj.until(ExpectedConditions.presenceOfElementLocated(loc));
		}
		
		public static WebElement waitForElementClickable(WebDriver driver,By loc)
		{
			WebDriverWait btnobj=new WebDriverWait(driver,Duration.ofSeconds(5));
			return btnobj.until(ExpectedConditions.elementToBeClickable(loc));
		}
		
		public static WebElement waitForVisibilityOfElement(WebDriver driver,By loc)
		{
			WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
			return obj.until(ExpectedConditions.visibilityOfElementLocated(loc));
		}

		
		public static boolean waitForUrlContains(WebDriver driver,String url)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			return wait.until(ExpectedConditions.urlContains(url));
					
		}
		
		public static boolean waitForTitleContains(WebDriver driver,String title)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			return wait.until(ExpectedConditions.titleContains(title));
					
		}
		
	public static void SelectBaseddropdown(WebElement ele,String value)
	{
        Select dd=new Select(ele);
	    
	    System.out.println("Is dropdown support multiple slection: "+dd.isMultiple());
	    
	    List<WebElement>AllOptions= dd.getOptions();
	    System.out.println("The all Options are: "+AllOptions.size());
	    
	    for(WebElement i:AllOptions)
	    {
	    	System.out.println(i.getText());
	       if(i.getText().contains(value))
	       {
	    	   i.click();
	    	   break;
	      }
	       
	    }
		
	}
	

}
