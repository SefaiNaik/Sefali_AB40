package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchAmazon_searchBook
{

	public static void main(String[] args) 
	{
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.amazon.in");
		WebElement  dropdown= d1.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("Books");
		WebElement search2=  d1.findElement(By.id("twotabsearchtextbox"));
		search2.sendKeys("world war");
		search2.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		  
		  
	}

}
