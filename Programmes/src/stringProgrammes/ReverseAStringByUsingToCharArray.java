package stringProgrammes;

public class ReverseAStringByUsingToCharArray {
public static void main(String[] args) {
	String s1="SDET";
	 char[] s2 = s1.toCharArray();
	 String s3=" ";
	for(int i=s2.length-1;i>=0;i--)
	{
		s3=s3+s2[i];
	}
	System.out.println(s3);
}
}
