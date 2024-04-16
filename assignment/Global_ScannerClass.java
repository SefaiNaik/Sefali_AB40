package assignment;

import java.util.Scanner;

public class Global_ScannerClass
{
static Scanner s1=new Scanner(System.in);
private static String name;
private static String name1;

	public static void main(String[] args) 
	{
		System.out.println("Enter first Name:");
		name=s1.nextLine();
		System.out.println("Enter Second Name");
		name1=s1.nextLine();
		
		s1.close();
		
		
		
	}

}
