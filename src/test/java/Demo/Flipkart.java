package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart{
  @Test
  public void FlipkartTest() throws InterruptedException {
	 WebDriver driver = new ChromeDriver(); 
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(1000);
	  
	  System.out.println("i updated the code");
	  
	  
	  
	  
	  
	  
  }
}
