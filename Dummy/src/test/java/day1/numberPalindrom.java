package day1;

public class numberPalindrom {

	public static void main(String[] args) 
	{
		
		int a=313;
		
		int temp=a;
		int sum=0;
		
		while(a!=0)
		{
			int reminder=a%10;
			sum=(sum*10)+reminder;
			a=a/10;
			
		}
		
		System.out.println(sum);
		
		if(sum==temp)
		{
			System.out.println("Given Number "+temp+" is palindrome");
		}
		else
		{
			System.out.println("Given Number "+temp+" is not palindrome");
		}
		
		

	}

}
