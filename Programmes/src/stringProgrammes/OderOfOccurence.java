package stringProgrammes;

import java.util.LinkedHashSet;

public class OderOfOccurence {
public static void main(String[] args) {
		String s= "welcome";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
				System.out.println(ch+": "+(i));//Note:::if they ask you to print index then remove +1 from (i+1)
				break;
				}
			}
		}
	}

}

