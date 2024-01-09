package Jarvis;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BootstrapDropDown 
{
	public static void BootstrapDropDown(List<WebElement>ddele,String value)
	{
		System.out.println("The total number of results on serch"+ddele.size());
		for(WebElement i:ddele)
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
