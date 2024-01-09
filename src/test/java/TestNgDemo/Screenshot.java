package TestNgDemo;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
  @Test
  public void capture() throws IOException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.redbus.in/");
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  
	  //Location
	  File dest=new File("./"+"\\Screenshots\\redbus1.png");
	  FileHandler.copy(temp, dest);
	  
  }
  
}
