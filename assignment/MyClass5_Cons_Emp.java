package assignment;

public class MyClass5_Cons_Emp 
{
	MyClass5_Cons_Emp()	
	{
		System.out.println("Emp details");
	}
	MyClass5_Cons_Emp(String name)
	{
		System.out.println("Emp name:"+name);
	}
	MyClass5_Cons_Emp(String nCompany,int Ltd)
	{
		System.out.println("Company name:"+nCompany);
		String id = null;
		System.out.println("Empl id:"+ id);
	}
	MyClass5_Cons_Emp(boolean b)
	{
		System.out.println();
	}
	public static void main(String[] args) {
		
	
	MyClass5_Cons_Emp e1=new MyClass5_Cons_Emp();
	new MyClass5_Cons_Emp("Sefali");
	new MyClass5_Cons_Emp("Abc",1234);
	new MyClass5_Cons_Emp();
		
	}
	
}
	


	