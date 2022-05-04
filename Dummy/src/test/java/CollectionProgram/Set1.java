package CollectionProgram;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Set1 {

	//Set is Interface which extends to collection interface and implemented by
	//Hash Set and LinkedHashSet
	
	public static void main(String[] args) 
	{
		 //HashSet- Don't follow the insertion order
		//          Don't allow duplicate values
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(10);
		hs.add(20);
		//hs.add(10);//Don't allow duplicate values,it not showing compile time error here but at run time 
		           //It will not print the value
		
		hs.add(30);
		hs.add(40);
		
		System.out.println(hs);//Output [20, 40, 10, 30] it means it dosent follow insertion order
		
		hs.remove(20);
		
		System.out.println(hs);//Output [40, 10, 30]
		
		hs.add(50);
		
		System.out.println(hs);//Output [50, 40, 10, 30]
		
		hs.add(60);
		System.out.println(hs);//Output [50, 40, 10, 60, 30]//Insertion Order not followed
		
		
		//TreeSet gives ascending order of collection
		
		TreeSet<Integer>ts=new TreeSet<Integer>();
		ts.addAll(hs);
		System.out.println(ts);//Output [10, 30, 40, 50, 60]
		
		//NavigableSet gives descendingSet of TreeSet
		
		NavigableSet ns=ts.descendingSet();
		
		System.out.println(ns);//Output [60, 50, 40, 30, 10]
		
		

	}

}
