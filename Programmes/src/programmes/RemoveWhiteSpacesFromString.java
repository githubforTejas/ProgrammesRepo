package programmes;

public class RemoveWhiteSpacesFromString {
public static void main(String[] args) {
	String str="java  pgm   selenium     automation";
	str=str.replaceAll("\\s", "");
	System.out.println("After removing the spaces :  "+str);
}
}
