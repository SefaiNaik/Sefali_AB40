package selenium_Automation_Assignment;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_InternetExp {

	public static void main(String[] args) 
	{
		InternetExplorerDriver d1=new InternetExplorerDriver();
		d1.get("https://www.amazon.com");
		d1.close();

	}

}
