package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon_arrow 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement dropdown= driver.findElement(By.id("searchDropdownBox"));
		dropdown.click();
		for(int i=0;i<=11;i++)
		{
			dropdown.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(5000);
		}
		dropdown.sendKeys(Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("world war");
		driver.findElement(By.id("twotabsearchtextbox")).click();
	}

}
