package assignment;

import java.util.Scanner;

public class Local_ScannerClass {

	public static void main(String[] args)
	{
	Scanner s1=new Scanner(System.in);
	
	int a,b,sum;
	System.out.println("Enter first Number:");
	a=s1.nextInt();
	System.out.println("Enter Second Number:");
	b=s1.nextInt();
	sum=a+b;
	System.out.println("sum:"+sum);
	s1.close();
	
	}

}
