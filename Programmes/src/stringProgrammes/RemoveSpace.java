package stringProgrammes;

public class RemoveSpace {
public static void main(String[] args) {
	String str="Hi Hello Welcome Bye";
	String [] s=str.split(" ");
	for(int i=0;i<s.length;i++)
	{
		String st=s[i];
		for(int j=st.length()-1;j>=0;j--)
		{
			System.out.print(st.charAt(i));
		}
		System.out.println(" ");
	}	
}
}
