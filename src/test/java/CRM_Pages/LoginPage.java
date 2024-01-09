package CRM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	
	 public LoginPage (WebDriver driver) 
	 { 
		 this.driver=driver;
	 }
	 
	 //Locator
	  private By eadd=By.xpath("//input[@id='email-id']");
	  private By pword=By.id("password");
	  private By rbtn=By.id("remember");
	  private By sbtn=By.id("submit-id");
	  
	  
	  //Method
	  public String geturl()
	  {
		  return driver.getCurrentUrl(); 
	  }
	  
	  public String gettittle()
	  {
		  return driver.getTitle();
	  }
	  
	   public String dologin(String em,String psw)
	   {
		driver.findElement(eadd).sendKeys(em);
		driver.findElement(pword).sendKeys(psw);
		driver.findElement(rbtn).click();
		driver.findElement(sbtn).click();
		String curl=driver.getCurrentUrl();
		return curl;
		   
	   }
	   
	 
}
