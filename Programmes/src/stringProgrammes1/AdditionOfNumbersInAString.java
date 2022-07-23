package stringProgrammes1;

public class AdditionOfNumbersInAString {
public static void main(String[] args) {
	
	String s="a11b22c33";
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			sum=sum+s.charAt(i);
		}
	}
	System.out.println(sum);
}
}
