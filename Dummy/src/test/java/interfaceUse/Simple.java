package interfaceUse;

public abstract class Simple 
{
	
	//We can create constructor of abstract class
	public Simple( int x)
	{
		System.out.println("Abstract class constructor x= "+x);
	}
	
	//Abstract class support to Method Overloading
	public void simpleMethod()
	{
		System.out.println("This is simple method");
	}
	
	public void simpleMethod(int y)
	{
		System.out.println("Parameterized method value "+y);
	}
	
	public  void  method1()
	{
		
	}

	public static void main(String[] args) 
	{
		//Simple s=new Simple();//Can not create object of Abstract class

	}

}
