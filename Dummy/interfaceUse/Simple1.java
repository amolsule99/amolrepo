package interfaceUse;

public class Simple1 extends Simple
{

	public Simple1()
	{
		super(10);
	}
	
	public void method1()
	{
		System.out.println("Abstract class method");
	}
	public static void main(String[] args) 
	{
		Simple1 s=new Simple1();
		s.simpleMethod();
		s.simpleMethod(20);
		s.method1();
	}

	

}
