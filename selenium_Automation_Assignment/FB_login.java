package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_login 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("asdf@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("asd@#3489");
		driver.findElement(By.name("login")).click();
		

	}

}
