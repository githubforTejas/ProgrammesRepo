package stringProgrammes;

public class StringPalindrome {
public static void main(String[] args) {
	String s="malayalam";
	
	String rev="";//No space should be given in the double quotes("");

	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev))
	{
		System.out.println("yes it is palindrome");
	}
	else
	{
		System.out.println("No it is not Palindrome");
	}
}
}
