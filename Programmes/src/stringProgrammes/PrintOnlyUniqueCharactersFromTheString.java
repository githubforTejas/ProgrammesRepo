package stringProgrammes;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrintOnlyUniqueCharactersFromTheString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please provide the input");
		String value = sc.next();
		String s=value;
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(ch+": "+count);
			}
}
}
}