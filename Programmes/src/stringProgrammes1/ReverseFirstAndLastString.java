package stringProgrammes1;

public class ReverseFirstAndLastString {
public static void main(String[] args) {
	String s= "ee sala cup namdhe";
	String[] s1 = s.split(" ");
	String temp=s1[0];
	s1[0]=s1[s1.length-1];
	s1[s1.length-1]=temp;
	for(int i=0;i<s1.length;i++)
	{
		System.out.print(s1[i]+" ");
	}
}
}
