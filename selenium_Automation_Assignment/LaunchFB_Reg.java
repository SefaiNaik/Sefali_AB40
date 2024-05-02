package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchFB_Reg {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		d1.findElement(By.name("firstname")).sendKeys("abcde");
		d1.findElement(By.name("lastname")).sendKeys("xyz");
		d1.findElement(By.name("reg_email__")).sendKeys("abcd@gmail.com");
		
		d1.findElement(By.name("reg_email_confirmation__")).sendKeys("abcd@gmail.com");
		d1.findElement(By.id("password_step_input")).sendKeys("asd@34098");
		Thread.sleep(2000);
		WebElement  dropdown=  d1.findElement(By.xpath("//*[@id=\"day\"]"));
		dropdown.click();
		Select s1=new Select(dropdown);
		s1.selectByValue("15");
		Thread.sleep(2000);
		
		WebElement  dropdown1=  d1.findElement(By.id("month"));
		dropdown1.click();
		Select s2=new Select(dropdown1);
		s2.selectByValue("6");
		Thread.sleep(2000);
		
		WebElement  dropdown2=  d1.findElement(By.id("year"));
		dropdown2.click();
		Select s3=new Select(dropdown2);
		s3.selectByValue("1996");
	}

}
