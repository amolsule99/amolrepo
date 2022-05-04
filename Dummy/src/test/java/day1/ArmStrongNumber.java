package day1;

public class ArmStrongNumber {

	public static void main(String[] args) 
	{
		
		//Armstrong number means 371=(3*3*3)+(7*7*7)+(1*1*1)
				//List of Armstrong numbers 153,370,371,407
				int x=370;
				int temp=x;
				int sum=0;
				
				while(x!=0)
				{
					int z=x%10;
					int a=z*z*z;
					sum=sum+a;
					x=x/10;
				}
		        if(temp==sum)
		        {
		        	System.out.println("Given number "+temp+ " is armstrong ");
		        }
		        
		        else
		        {
		        	System.out.println("Given number "+temp+ " is not armstrong ");
		        }
	}

}
