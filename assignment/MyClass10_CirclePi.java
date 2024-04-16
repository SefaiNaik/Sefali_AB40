package assignment;

import java.util.Scanner;

public class MyClass10_CirclePi {
	public static double pi=Math.PI;
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("radius of the circle:");
		int radius=s1.nextInt();
		double circumantance=calculateCircumantance(radius);
		System.out.println("area of the circle is:"+circumantance);
	}
		
		
	private static double calculateCircumantance(int radius) {
		return 2*pi*radius;
		
	}


	

}
