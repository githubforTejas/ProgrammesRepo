package stringProgrammes1;

public class StringPalindrome {
public static void main(String[] args) {
	String s="mom";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev))
	{
		System.out.println("Yes it is a String palindrome");
	}
	else
	{
		System.out.println("No it is not a String Palindrome");
	}
}
}
