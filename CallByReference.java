package day1;

public class CallByReference 
{

	public static void swapByReference(int a,int b)
	
	{
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swap a= "+a);
		System.out.println("After Swap b= "+b);
		
	}
	
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		System.out.println("Before Swap a="+a);
		System.out.println("After Swap b= "+b);
		
		//Calling function to swap
		swapByReference(a,b);
		
		System.out.println("After swap both value will be same");
		
		System.out.println("After swap a= "+a+"  After swap b= "+b);

	}

}
