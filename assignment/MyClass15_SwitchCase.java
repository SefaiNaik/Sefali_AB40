package assignment;

import java.util.Scanner;

public class MyClass15_SwitchCase 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter number:");
		
		int week=s1.nextInt();
		switch (week) {
		case 1: {
			
			System.out.println("monday");
			break;
		}
			case 2:
			{
				System.out.println("tuesday");
				break;
		}
		case 3:
		{
			System.out.println("wednesday");
		}
		
		case 4:
		{
			System.out.println("Thursday");
			break;
		}
		case 5:
		{
			System.out.println("Friday");
			break;
		}
			default:
				System.out.println("Invalid Input ");
		}
		
			
		}
				
			
		
	}


