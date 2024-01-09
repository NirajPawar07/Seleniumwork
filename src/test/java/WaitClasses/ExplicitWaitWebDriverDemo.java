package WaitClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Jarvis.Utility;

public class ExplicitWaitWebDriverDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		By btn=By.xpath("//button[text()='Start']");
		By text=By.xpath("(//h4)[2]");
		
		Utility.waitForElementClickable(driver, btn).click();
		WebElement ele=Utility.waitForVisibilityOfElement(driver, text);
		System.out.println("The Text is: "+ele.getText());

	}

}
