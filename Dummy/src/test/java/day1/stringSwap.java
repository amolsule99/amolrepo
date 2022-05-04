package day1;

public class stringSwap {

	public static void main(String[] args)
	{
		String a="amol";
		String b="sule";
		
		
		System.out.println("Before swap a= "+a);
		System.out.println("Before swap b= "+b);
		
		
		 /*System.out.println("After swap a="+a.replace(a, b));
		 System.out.println("After swap b="+b.replace(b, a));*/
		
		a=a+b;
		
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("Before swap a= "+a);
		System.out.println("Before swap b= "+b);
		
		
		
	}

}
