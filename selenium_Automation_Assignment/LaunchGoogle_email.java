package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_email {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement s1=   driver.findElement(By.name("q"));
		s1.sendKeys("gmail");
		s1.sendKeys(Keys.ENTER);
		
		driver.findElement(By.partialLinkText("Gmail - Google")).click();

	}

}
