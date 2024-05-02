package selenium_Automation_Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {

	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.close();

	}

}
