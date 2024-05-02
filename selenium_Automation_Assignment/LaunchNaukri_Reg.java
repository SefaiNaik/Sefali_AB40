package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchNaukri_Reg {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com");
		Thread.sleep(2000);
		WebElement s1=   d1.findElement(By.id("APjFqb"));
		s1.sendKeys("naukri");
		s1.sendKeys(Keys.ENTER);
		d1.findElement(By.partialLinkText("Naukri - India's No.1 Job Site")).click();
		Thread.sleep(2000);
		d1.findElement(By.linkText("Google")).click();

	}

}
