package selenium_Automation_Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_google {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	}

}
