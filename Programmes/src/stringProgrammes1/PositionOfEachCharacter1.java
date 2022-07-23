package stringProgrammes1;

public class PositionOfEachCharacter1 {
public static void main(String[] args) {
	String s="aabcd";
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i)+"= "+(i+1));
	}
}
}
