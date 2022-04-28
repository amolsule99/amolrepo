package day1;

import org.testng.annotations.Test;

public class ExceptionHndle
{

	@Test(expectedExceptions=ArithmeticException.class)
	public void expectedExcep()
	{
		int a=10;
		
		int b=a/0;
		
		System.out.println("After Exception");
	}
}
