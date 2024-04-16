package assignment;
abstract class  AbstClass1
{
	abstract void  method1();
	abstract void  method2();
	
}
abstract class  AbstClass2
{
	abstract void  method3();
	abstract void  method4();
	void concreteMethod()
	{
		System.out.println("Concrete Method  in AbstractClass2");
	}
}

class  ConcreteClass extends AbstClass2
{
	void  method1()
	{
		System.out.println("Method1 in ConcreteClass");
	}
	void  method2()
	{
		System.out.println("Method2 in ConcreteClass");
	}
	void method3()
	{
		System.out.println("Method3 in ConcreteClass");
	}
	void method4()
	{
		System.out.println("Method4 in ConcreteClass");	
	}
	void additionalMethod()
	{
		System.out.println("additional methodin concrete class");		
	}
	
}

public class MyClass16_MultiLevel
{

	public static void main(String[] args) 
	{
		ConcreteClass   obj=new   ConcreteClass();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.concreteMethod();
		obj.additionalMethod();

	}

}
