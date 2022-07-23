package stringProgrammes;

public class FindMinLength {
public static void main(String[] args) {
	String[] s= {"oracle","training","programme"};
	String min=s[0];
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()<min.length())
		{
			min=s[i];
		}
	}
	System.out.println(min);
}
}
