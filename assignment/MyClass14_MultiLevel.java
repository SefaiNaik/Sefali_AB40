package assignment;

class Student_class
{
Student_class()
{
	System.out.println("5");
}
}
class Math_cls extends Student_class
{
	Math_cls()
	{
		System.out.println("4");
	}
}
class History_cls extends Math_cls
{
	History_cls()	
	{
		System.out.println("3");
	}
}
class English_cls extends History_cls
{
	English_cls()
	{
		System.out.println("2");
	}
}
class Geography_cls extends English_cls
{
	Geography_cls()	
	{
		System.out.println("1");
	}
}

public class MyClass14_MultiLevel {

	public static void main(String[] args)
	{
		Geography_cls g1=new Geography_cls();	
	}

}
