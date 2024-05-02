package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_ByValue {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		  WebElement dropdown= driver.findElement(By.id("searchDropdownBox"));
		  Select s1=new Select(dropdown);
		  s1.selectByValue("search-alias=amazon-devices");
		
		
	}

}
