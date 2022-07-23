package programmes;

public class ReverseTheWordsIOfTheString {
	public static void main(String[] args) {
		String s1="Welcome To Bengaluru";

		String[] words = s1.split(" ");

		String reverseString=" ";
		for(String word:words)
		{
			String revWord=" ";
			for(int i=word.length()-1;i>=0;i--)
			{
				revWord=revWord+word.charAt(i);
			}
			reverseString=reverseString+revWord+" ";
		}
		System.out.println("After reversing "+reverseString);
	}
}
