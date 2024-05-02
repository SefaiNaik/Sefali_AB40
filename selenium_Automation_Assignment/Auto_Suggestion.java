package selenium_Automation_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement search=  driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		List<WebElement> a1 =  driver.findElements(By.xpath("//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div/div[1]/div[8]/div/div/span"));
		int count= a1.size();
		System.out.println(count);
		a1.get(5).click();

	}

}
