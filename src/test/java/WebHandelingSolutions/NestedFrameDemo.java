package WebHandelingSolutions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NestedFrameDemo {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		String text1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
		
		//driver.switchTo().frame("frame-top");
		driver.switchTo().frame(0);
		driver.switchTo().frame("frame-left");
		System.out.println("Left frame source");
		System.out.println(driver.getPageSource());

	}

}
