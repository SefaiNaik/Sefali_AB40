package assignment;

import java.util.Scanner;

public class MyClass20b_Array 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int[]array=new int[5];
		System.out.println("enter 5 integer");
		for(int i=0; i<5; i++)
		{
			array[i]=s1.nextInt();
		}
		System.out.println(" values stored in the array:");
		for(int i=0; i<5; i++)
		{
			System.out.println(array[i]);
		}
		s1.close();

	}

}
