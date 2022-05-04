package interfaceUse;

public class SBIBank extends ReserveBank
{

	public int  RateOfInterest()
	{
		return 8;
	}
	public static void main(String[] args) 
	{
		ReserveBank rb=new ReserveBank();
		System.out.println(rb.RateOfInterest());
		
		SBIBank sb=new SBIBank();
		System.out.println(sb.RateOfInterest());
		
		//In method overriding if we create parent ref child object it will execute child methods.
		ReserveBank rb1=new SBIBank();
		System.out.println(rb1.RateOfInterest());
	}

}
