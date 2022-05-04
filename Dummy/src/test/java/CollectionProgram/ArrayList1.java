package CollectionProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		//ArrayList contains heterogeneous data as we seen that Array contains homogeneous data
		//ArrayList Follow the Insertion order and allow to duplicate elements.
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("amol");
		al.add("sule");
		al.add("amol");
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//System.out.println(al);
		
		al.remove(1);
		
		System.out.println(al);
		
		al.add(20);
		
		System.out.println(al);
		
		al.set(1,30);
		
		System.out.println(al);
		
	}

}
