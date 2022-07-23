package stringProgrammes1;

public class NumberPalindrome {
public static void main(String[] args) {
	int no=454;
	int copy=no;
	int rev=0;
	while(no!=0)
	{
		int rem = no%10;
		rev=rev*10+rem;
		no=no/10;
	}
	if(rev==copy)
	{
		System.out.println("Number palindrome");
	}
	else
	{
		System.out.println("Not a Number palindrome");
	}
}
}
