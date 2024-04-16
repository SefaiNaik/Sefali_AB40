package assignment;

import java.util.Scanner;

public class MyClass22B 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a num");
		int num=s1.nextInt();
		String result="";
		if(num % 3==0)
		{
			result +="Frog";
		}
		if(num % 5==0)
		{
			if(!result.isEmpty())
			{
				result +="cat";
			}
			if(result.isEmpty())
			{
				result="neither divisible by 3 nor 5";
			}
			System.out.println(result);
			s1.close();
			}
		}

	}


