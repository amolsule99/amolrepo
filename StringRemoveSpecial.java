package day1;

import java.util.Arrays;

public class StringRemoveSpecial 
{

	
	public static void main(String[] args) 
	{
		String s="This_is_my_first_program";
		
		String s1="This##@@my**mix5587program";
		
		System.out.println(s.replaceAll("_", " "));
		
		System.out.println(s1.replaceAll("[^a-zA-Z0-9]",""));
		
	}

}
