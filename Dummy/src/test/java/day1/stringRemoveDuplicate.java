package day1;

import java.util.Arrays;

public class stringRemoveDuplicate
{

	public static void removeDuplicate(char str[],int leng)
	{
		//Create index variable to use it in modified string
		
		int index=0;
		
		//Step-5 Traverse through char array
		
		int j;
		
		for(int i=0;i<leng;i++)
		{
			//System.out.print(str[i]);
			
			for( j=0;j<i;j++)
			{
				if(str[i]==str[j])
				{
					break;
				}
			}
			
			//if character is not present before,add it to resulting string
			
			if(j==i)
			{
				str[index++]=str[i];
			}
			
		}
		
		System.out.println(String.valueOf(Arrays.copyOf(str, index)));
	}
	
	
	public static void main(String[] args) 
	{
		//Step-1 Write one string
		String s="lalit";
		
		//Step-2 Convert string to char array
		char []arr=s.toCharArray();
		
		//Step-3 Find length of char array
		int length=arr.length;
		
		//Step-4 call removeDuplicate() method
		
		removeDuplicate(arr,length);
		
		
	}

}
