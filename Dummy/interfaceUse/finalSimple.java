package interfaceUse;

public final class finalSimple 
{
	//final class can not be extended
	//1-We can create constructor of final class
     public finalSimple()
     {
    	 System.out.println("Final class constructor");
     }
     
     //Final class dosent contain abstract methods as implimentation of abstract methods 
     //is done by implementing class and final class dosent support to inheritance
     public final void method()
     {
    	 
     }
	public static void main(String[] args) 
	{
		//We can create object of final class
       finalSimple fs=new finalSimple();
	}

}
