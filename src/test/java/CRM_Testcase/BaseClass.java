package CRM_Testcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import CRM_Pages.LoginPage;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeTest
	public void SetUpBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/login.html");
		
		lp=new LoginPage(driver);
		
		
	}
	  @BeforeTest
	   public void SetUpPage()
	   {
		  System.out.println("===========Login Page========");
		  System.out.println(" URL is: "+lp.geturl());
		  System.out.println("The Tittle is: "+lp.gettittle());
		  lp.dologin("Test@gmail.com","test1234");
		   
	   }
	  
	    
	

}
