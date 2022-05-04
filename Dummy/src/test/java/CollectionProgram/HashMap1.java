package CollectionProgram;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 
{

	public static void main(String[] args) 
	{
		//Hash map is not synchronized
         HashMap<Integer,String> map=new HashMap<Integer,String>();
         
         map.put(1, "amol");
         map.put(2,"sule");
       //  map.put(3," ");
         map.put(2, "sule-patil");//Map dosent allow duplicate keys,but if we do that ,it will replace earlier value
         map.putIfAbsent(3,"AQM");
         
         System.out.println("Iterating map");
         
         for(Map.Entry m:map.entrySet())
         {
        	 System.out.println(m.getKey()+" "+m.getValue());//Output 1 amol
        	                                                 //       2 sule-patil
        	                                                 //       3 AQM
         }
	}

}
