package CollectionProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList3 {

	public static void main(String[] args) 
	{
		//String array
		String [] str= {"amol","sule","mumbai"};
		
		//You can pass any Array to ArrayList as argument
		ArrayList<String>al=new ArrayList<String>(Arrays.asList(str));
		
		al.add("Automation");
		al.add("Java");
		al.add("selenium");
		
		System.out.println(al);

	}

}
