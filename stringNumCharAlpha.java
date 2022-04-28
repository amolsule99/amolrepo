package day1;

public class stringNumCharAlpha {

	public static void main(String[] args)
	{
		String s="Amol555678@3%**";
		
		String alphabets="";
		int alphaCount=0;
		
		String number="";
		int numCount=0;
		
		String special="";
		int specialCount=0;
		
		
		for(int i=0;i<=s.length()-1;i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				alphabets=alphabets+s.charAt(i);
				alphaCount=alphaCount+1;
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				number=number+s.charAt(i);
				numCount=numCount+1;
			}
			
			else
			{
				special=special+s.charAt(i);
				specialCount=specialCount+1;
			}
			
			
		}
		
		System.out.println("alphabets= "+alphabets);
		System.out.println("number= "+number);
		System.out.println("special= "+special);
		
		System.out.println("number alphabets = "+alphaCount);
		System.out.println("number of digits= "+numCount);
		System.out.println("number of special characters= "+specialCount);

	}

}
