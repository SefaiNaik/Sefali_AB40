package selenium_Automation_Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_relativeXpath
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Flipkart.com");
	WebElement search=	driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("Bag");
	search.sendKeys(Keys.ENTER);
	}

}
