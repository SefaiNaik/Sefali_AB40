package assignment;

import java.util.Scanner;

public class MyClass13_Crcl10times {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		for(int i=0; i<10;i++)
		{
			System.out.println("Radius of the circle:");
			double radius=s1.nextDouble();
			double area=Math.PI*radius*radius;
			System.out.println("Rarea of the C=circlr with radius"+radius+"is:"+area);
		}
	
//s1.close();
	}

}
