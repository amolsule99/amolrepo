package CollectionProgram;

import java.util.ArrayList;

public class ArrayList4 {

	
	public static void main(String[] args) 
	{
		ArrayList<String>al1=new ArrayList<String>();
		
		al1.add("20");
		al1.add("50");
		
		System.out.println(al1);//Output [20, 50]
		
		ArrayList<String>al2=new ArrayList<String>();
		
		al2.add("20");
		al2.add("30");
		al2.add("40");
		al2.add("50");
		
		System.out.println(al2);//Output [20, 30, 40, 50]
		
		System.out.println(al2.retainAll(al1));//true
		
		
		System.out.println(al2);//Output [20, 50] retainAll retains only common elements into (al2) specified collection
	}

}
