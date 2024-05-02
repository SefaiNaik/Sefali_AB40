package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_RelativeXpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dghj");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("xyz");
		


	}

}
