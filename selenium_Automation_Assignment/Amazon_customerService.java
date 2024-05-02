package selenium_Automation_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_customerService 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[5]/div/div[1]/div[1]/div[1]/a/div/div/div/div[2]/h3")).click();

	}

}
