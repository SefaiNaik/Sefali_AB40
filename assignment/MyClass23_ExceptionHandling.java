package assignment;

import java.util.Scanner;

public class MyClass23_ExceptionHandling 
{

	public static void main(String[] args) 
	{
		
	Scanner s1=new Scanner(System.in);
	System.out.println("size of array:");
	int size=s1.nextInt();
	int[]array=new int[size];
	try {
		System.out.println("enter" + size +"eleme:nts");
		for(int i=0; i<size; i++)
		{
			array[i]=s1.nextInt();
		}
		System.out.print("element to search:");
		int ele=s1.nextInt();
		int index=search(array,ele);
		if(index !=-1)
		{
			System.out.println("ele"+ ele + "found at index" +index);
		}
		else
		{
			
		System.out.println("ele" + ele + "not found in the array");	
		}
	}
	catch(Exception e) {
		System.out.println("Error:"+e.getMessage());
		}
	finally
	{
		s1.close();
	}
	
	}

	private static int search(int[] array, int ele) {
		for(int i=0; i<array.length; i++)
		{
			if(array[i]==ele)
			{
		return i;
	}
		}
		return -1;
	}
}
	

