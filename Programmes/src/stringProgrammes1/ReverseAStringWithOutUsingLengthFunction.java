package stringProgrammes1;

import java.util.LinkedHashSet;

public class ReverseAStringWithOutUsingLengthFunction {
public static void main(String[] args) {
	String s="Tester";
	char[] s1 = s.toCharArray();
	int count=0;
	for(char s2:s1)
	{
		count++;
	}
	for(int i=count-1;i>=0;i--)
	{
		System.out.print(s1[i]);
	}
	


}
}
