package stringProgrammes;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicatersCharacterFromtheString {
public static void main(String[] args) {
	String s="Hello";
	//to preserve the order of insertion
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		System.out.print(s.charAt(i));
		set.add(s.charAt(i));
		//REMOVED THE DUPLICATES===>>JUST RUN AND SEE THE OUTPUT
		System.out.println(set);
	}
	//it will remove the duplicates==>>output=Helo
	System.out.println(set);
}
}
