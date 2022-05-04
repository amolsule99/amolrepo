package CollectionProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList2 {

	public static void main(String[] args) 
	{
		
		List<String>al=new ArrayList<String>();
		
		al.add("amol");
		al.add("sule");
		al.add("Automation");
		
		//ListIterator traverse in forward manner and also in backword manner 
		ListIterator ltr=al.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		al.remove(1);
		
		System.out.println(al);
		
		al.add("Sule");
		
		System.out.println(al);
		
		/*while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}*/
		
		ArrayList<String>al1=new ArrayList<String>();
		
		al1.add("mumbai");
		al1.add("AQM");
		
		//You can add one collection into another collection
		al.addAll(al1);
		
		System.out.println(al);//Output [amol, Automation, Sule, mumbai, AQM]

		al.removeAll(al1); //Remove the collection 
		
		System.out.println(al);//Output [amol, Automation, Sule]
		
	}

}
