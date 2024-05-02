package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFieldCopy_paste {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement  firstname= driver.findElement(By.id("fname"));
		firstname.sendKeys("sefali");
		firstname.sendKeys(Keys.CONTROL+"a");
		firstname.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		WebElement  lastname= driver.findElement(By.id("lname"));
		lastname.sendKeys(Keys.CONTROL+"v");

	}

}
