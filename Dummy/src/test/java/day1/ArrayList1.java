package day1;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("amol");
		al.add("sule");
		al.add("amol");
		al.add("mumbai");
		al.remove(2);
		al.add(1,"sule-patil");
		
		//Iterator itr=al.iterator();
		
		ListIterator list=al.listIterator();
		
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
		
		//ListIterator list=al.listIterator();
		
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
		

	}

}
