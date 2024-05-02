package selenium_Automation_Assignment;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_hoverOver {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		WebElement e1=  driver.findElement(By.className("_1XjE3T"));

	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();
	
	
	

}
}