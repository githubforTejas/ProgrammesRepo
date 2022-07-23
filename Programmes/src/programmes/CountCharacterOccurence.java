package programmes;

public class CountCharacterOccurence {
public static void main(String[] args) {
	String s="java programming java oops";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a')
		{
			count++;
		}
	}
	System.out.println("a is repeated for "+count+" times");
}
}
