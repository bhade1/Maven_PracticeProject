package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void AmazonTest() throws InterruptedException {
	  
	 WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  
	  Thread.sleep(1000);
	
	  System.out.println("hi good evening");
  }
}
