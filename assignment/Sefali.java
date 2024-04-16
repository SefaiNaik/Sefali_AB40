package assignment;

public class Sefali 
{
	Sefali(int a)
	{
		System.out.println("1");
		
	}
	Sefali(char a)
	{
		System.out.println("2");
	}
	Sefali(String g)
	{
		System.out.println("3");
	}
Sefali(boolean a)
{
	System.out.println("4");
}
Sefali(int c,boolean b,String s)
{
	System.out.println("5");
}
	public static void main(String[] args) 
	{
		new Sefali(24,true,"Naik");
		new Sefali(true);
		new Sefali("sef");
		new Sefali("i");
		new Sefali(15);
		

	}

}
