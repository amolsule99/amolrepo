package interfaceUse;

public class BankSBI implements Interface1{

	
	public static void main(String[] args)
	{
		Interface1 sbi=new BankSBI();
		
		System.out.println("Rate Of Interest of SBI="+sbi.rateOfInterest());
		
	
		//In the case of Interface ,if we create Parent ref,child object then only parent methods i.e
		//interface methods will get available.
	}

	public int rateOfInterest() 
	{
		
		return 7;
	}
	
	public void sbiClient()
	{
		
	}

	public void banking()
	{
		
		
	}

}
