package selenium_Automation_Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_dropdown {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//click on dropdown ALL
		WebElement   dropdown=    driver.findElement(By.xpath( "//*[@id=\"searchDropdownBox\"]"));
		
		Select s1=new Select(dropdown);
		s1.selectByIndex(7);
		
	}
		
	}


