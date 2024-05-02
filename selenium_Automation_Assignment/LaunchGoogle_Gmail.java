package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_Gmail {

	public static void main(String[] args) throws InterruptedException 
	{ 
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Gmail")).click();

	}

}
