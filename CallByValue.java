package day1;

public class CallByValue 
{

	//Call by value means your original value dosent get change
	int data=50;
	
	public void change(int data)
	{
		data=data+100;  //Changes in your local variable only
	}
	
	public static void main(String[] args) 
	{
		CallByValue value=new CallByValue();
		
		System.out.println("Before Change="+value.data);
		
		//In call by value we can call the method by passing value
		value.change(200);
		
		System.out.println("After Change= "+value.data);
		
		
	}

}
