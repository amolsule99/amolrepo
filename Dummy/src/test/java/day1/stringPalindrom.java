package day1;

public class stringPalindrom {

	public static void main(String[] args)
	{
		
		String a="madam";
		String temp=a;
		String reverse="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			reverse=reverse+a.charAt(i);
			
		}
		
		System.out.println(reverse);
		
		if(reverse.equals(temp))
		{
			System.out.println("String is palindrome");
		}
		
		else
		{
			System.out.println("String is not palindrome");
		}
		
		
	}

}
