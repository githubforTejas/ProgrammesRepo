package stringProgrammes;

public class FindTheStringOfMinLength {
public static void main(String[] args) {
	String [] s= {"a","ab","Hello","welcome","Hi","b","c","D"};
	String min=s[0];
	for(int i=0;i<s.length;i++)
	{
		if(s[i].length()<min.length())
		{
			min=s[i];
		}
	}
	//this below for loop is to find the another minimum string of the same length 
	for(int i=0;i<s.length;i++)
	{
		if(min.length()==s[i].length())
		{
			System.out.println(s[i]);
		}
	}
}
}
