package stringProgrammes;

import java.util.LinkedHashSet;

public class ConvertToUpperCaseAndRemoveDuplicates {
public static void main(String[] args) {
	String s="WElcome";
	String s1=s.toLowerCase();
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s1.length();i++)
	{
		set.add(s1.charAt(i));
	}
	for(Character ch:set)
	{
		System.out.print(ch);
	}
}
}
