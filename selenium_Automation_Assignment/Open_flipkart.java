package selenium_Automation_Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_flipkart {

	public static void main(String[] args) 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.close();

	}

}
