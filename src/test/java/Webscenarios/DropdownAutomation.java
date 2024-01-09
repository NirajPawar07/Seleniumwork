package Webscenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAutomation {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println("The tittle is: "+driver.getTitle());
		
	
	    WebElement ele=driver.findElement(By.name("url"));

		//Selectbase Dropdown:
	    Select dd=new Select(ele);
	    
	    System.out.println("Is dropdown supports the Multiple Selections: "+dd.isMultiple());
	    
	    //Selections Method
	    dd.selectByIndex(2);
	    Thread.sleep(2000);
	    dd.selectByVisibleText("Health & Personal Care");
	    Thread.sleep(2000);
	    dd.selectByValue("search-alias=office-products");
	    
	    //droupdown all options method:
	    List<WebElement>AllOptions=dd.getOptions();
	    System.out.println(AllOptions.size());
	    
	    for(WebElement i:AllOptions)
	    {
	    	System.out.println(i.getText());
	    	
	    	if(i.getText().contains("Movies & TV Shows"))
	    	{
	    		i.click();
	    		break;
	    	}
	    }
	}

}
