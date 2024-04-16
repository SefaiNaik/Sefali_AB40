package assignment;

import java.util.ArrayList;

public class MyClassArray 
{



	private static int i;

	public static void main(String[] args) 
	{
	ArrayList<Integer> arrayList=new ArrayList<Integer>(4);
	arrayList.add(1);
	arrayList.add(2);
	arrayList.add(3);
	arrayList.add(4);
	
	arrayList.add(4,5);
	System.out.println("ArrayList element:");
	for(int i=0; i <arrayList.size();i++)
	{
		System.out.println("index"+ i+":"+ arrayList.get(i));
	}
	}

}
