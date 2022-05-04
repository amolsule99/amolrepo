package day1;

import java.util.Arrays;

public class stringAnagram 
{

	
	public static void main(String[] args) 
	{
		String s1="keep";
		String s2="peek";
		
		char[]str1=s1.toLowerCase().toCharArray();
		char[]str2=s2.toLowerCase().toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		if(Arrays.equals(str1, str2))
		{
			System.out.println("String  "+s1+ " and String "+s2+"  are anagram");
		}
		
		else
		{
			System.out.println("String  "+s1+ " and String "+s2+"  are  not anagram");
		}
	}

}
