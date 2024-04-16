package assignment;

import java.util.Scanner;

public class MyClass21B_String 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a string");
		String input=s1.nextLine();
		if(isDigit(input))
		{
			System.out.println("digit");
		}
		else
		{
			System.out.println("non-digit");
	}
		s1.close();
	}
	public static boolean isDigit(String str)
	{
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(!Character.isDigit(ch))
			{
				return false;
				
			}
	
		}
return true;
	}

}
