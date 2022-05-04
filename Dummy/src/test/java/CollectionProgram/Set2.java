package CollectionProgram;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set2 
{

	public static void main(String[] args) 
	{
		
        //As we seen that HashSet not follow the insertion order,
		//And if want to follow the insertion order we go through LinkedHashSet
		
		LinkedHashSet <Integer>lhs=new LinkedHashSet<Integer>();
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		
		Iterator itr=lhs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		lhs.remove(20);
		
		System.out.print(lhs);//[10, 30]
		
		lhs.add(20);
		
		System.out.print(lhs);//Output [10, 30, 20] here insertion order is followed by LinkedHashSet
		                      //as 20 is added at end.
	}

}
