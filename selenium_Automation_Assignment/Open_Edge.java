package selenium_Automation_Assignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Open_Edge {

	public static void main(String[] args) 
	{
		EdgeDriver d1=new EdgeDriver();
		d1.get("https://www.flipkart.com");
		d1.close();
	}

}
