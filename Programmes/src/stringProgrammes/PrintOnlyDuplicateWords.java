package stringProgrammes;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateWords {
public static void main(String[] args) {
		String s="Hi Hi Hello Welcome Bye";
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<s1.length;i++)
		{
			set.add(s1[i]);
		}
		for(String value:set)
		{
			int count=0;
			for(int i=0;i<s1.length;i++)
			{
				if(value==s1[i])
				{
					count++;
				}
			}
		if(count>1)
		{
		System.out.println(value);	
		}
		}
	
}
}
