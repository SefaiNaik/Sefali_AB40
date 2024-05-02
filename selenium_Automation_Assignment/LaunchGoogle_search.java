package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_search
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search=   driver.findElement(By.name("q"));
		search.sendKeys("INDIA");
		search.sendKeys(Keys.ENTER);
		
	
		

	}

}
