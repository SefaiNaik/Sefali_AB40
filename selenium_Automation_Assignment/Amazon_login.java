package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_login
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		//driver.findElement(By.name("")).sendKeys("");//enter character page/image link
		driver.findElement(By.linkText("Try different image")).click();//for image link
	}

}
