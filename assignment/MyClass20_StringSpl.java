package assignment;

public class MyClass20_StringSpl 
{

	public static void main(String[] args) 
	{
	String s1="Automation # Testing!! Class";
	int SpecialCharCount=countSpecialCharacters(s1);
	System.out.println("num of special characters in the string:"+ SpecialCharCount);

	}
	public static int countSpecialCharacters(String s1)
	{
		int count=0;
		for(int i=0; i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(!Character.isLetterOrDigit(ch)&&!Character.isWhitespace(ch))
			{
				count++;
			}
		}
		return count;
	}

}
