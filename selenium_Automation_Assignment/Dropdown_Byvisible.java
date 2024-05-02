package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Byvisible {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement dropdown=   driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("Amazon Devices");
	}

}

