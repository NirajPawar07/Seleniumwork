package Webscenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdownTest {
	
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

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
	    driver.findElement(By.linkText("Create new account")).click();
	    
	    //dropdown 
	    WebElement dayele=driver.findElement(By.id("day"));
	    SelectBaseddropdown(dayele,"14");
	    
	    Select dd=new Select(dayele);
	    
	    System.out.println("Is dropdown support multiple slection: "+dd.isMultiple());
	    
	    List<WebElement>AllOptions= dd.getOptions();
	   System.out.println("The all Options are: "+AllOptions.size());
	    
	   for(WebElement i:AllOptions)
	    {
	    	//System.out.println(i.getText());
       if(i.getText().contains("24"))
	       {
	    	   i.click();
	    	   break;
	      }
	       
	    }
	       //MonthDropdown
	        WebElement monele=driver.findElement(By.id("month"));
	        SelectBaseddropdown(monele,"Jan");
	        
	        //Yeardropdown
	         WebElement yele=driver.findElement(By.id("year"));
	         SelectBaseddropdown(yele,("2002"));
		

	}

}
