package assignment;

import java.util.Scanner;

public class MyClass21A_Alpha 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a String:");
		String input=s1.nextLine();
		if(isAlpha(input))
		{
			System.out.println("alphabrtic characters");
		}
		else
		{
			System.out.println("non-alphabetic characters");
		}
		s1.close();

	}
	public static boolean isAlpha(String str)
	{
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			
			
				if(!Character.isLetter(ch))
				{
					return false;
				}
		}
		return true;
	}

}
