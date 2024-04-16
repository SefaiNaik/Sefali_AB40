package assignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyClass18_FutureTime 
{

	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);
	System.out.println("Current date and time(YYYY-DD HH:MM)");
	String inputDateTime=s1.nextLine();
	
	DateTimeFormatter Formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	LocalDateTime  currentDateTime=LocalDateTime.parse(inputDateTime,Formatter);
	
	LocalDateTime futureDateTime=currentDateTime.plusDays(10);
	String formattedFutureDateTime=futureDateTime.format(Formatter);
	System.out.println("current date and time:"+inputDateTime);
	System.out.println("future date and time in 10 days:"+formattedFutureDateTime);
	s1.close();
	
	
	}

}
