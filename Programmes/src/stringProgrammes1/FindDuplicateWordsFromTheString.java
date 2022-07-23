package stringProgrammes1;

import java.util.LinkedHashSet;

public class FindDuplicateWordsFromTheString {
	public static void main(String[] args) {
		String s="welcome to india welcome to tyss";
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
				if(value.equals(s1[i]))
				{
					count++;

				}
			}
			if(count>1)
			{
				System.out.println(value+" "+count);
			}


		}
	}
}

