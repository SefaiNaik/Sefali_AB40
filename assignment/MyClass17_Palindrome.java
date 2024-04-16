package assignment;

import java.util.Scanner;

public class MyClass17_Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a no.:");
		int number=s1.nextInt() ;
		if(isPalindrome(number)) {
			System.out.println("input is palindrome.");
		}
		else {
			System.out.println("input is not palindrome");
		}
	}

	private static boolean isPalindrome(int number) {
		int OriginalNumber=number;
		int  reversedNumber=0;
		
		while(number>0)
		{
			int digit=number % 10;
			reversedNumber=reversedNumber*10+digit;
			number/=10;
		}
		return  OriginalNumber==reversedNumber;
			
	}
	

	
	}


