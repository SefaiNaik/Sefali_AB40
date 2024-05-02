package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hover_over {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement e1=  driver.findElement(By.id("nav-link-accountList"));
Actions a1=new Actions(driver);
a1.moveToElement(e1).perform();
	}

}

