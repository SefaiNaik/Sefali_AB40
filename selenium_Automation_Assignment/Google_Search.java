package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search 
{

	public static void main(String[] args)
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com");
		d1.findElement(By.name("q")).sendKeys("INDIA");
		d1.findElement(By.name("gNO89b")).click();


	}

}
