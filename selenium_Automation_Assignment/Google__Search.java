package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google__Search {

	public static void main(String[] args) 
	{
		
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com");
		WebElement  search=    d1.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);

	}

}
