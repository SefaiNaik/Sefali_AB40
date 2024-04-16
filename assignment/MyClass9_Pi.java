package assignment;

import java.util.Scanner;

public class MyClass9_Pi 
{
	public static double pi=Math.PI;
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("radius of the circle:");
		int radius=s1.nextInt();
		double area=calculateArea(radius);
		System.out.println("area of the circle is:"+area);
	}
		
		
	private static double calculateArea(int radius) {
		
		return pi*radius*radius;
	}
	

}
