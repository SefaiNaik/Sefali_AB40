package selenium_Automation_Assignment;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.close();

	}

}
