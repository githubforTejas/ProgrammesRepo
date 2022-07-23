package stringProgrammes;

public class FindThePositionOfEachCharacter {
	public static void main(String[] args) {

	String s="acbabcabac";
	for(int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i)+"= "+(i+1));
	}
}
}
