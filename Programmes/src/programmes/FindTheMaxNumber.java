package programmes;

public class FindTheMaxNumber {
	public static void main(String[] args) {
String[] a= {"1","223","4556","77895","89654"};
String max=a[0];
for(int i=0;i<a.length;i++)
{
	if(a[i].length()>max.length())
	{
		max=a[i];
	}
	
}
System.out.println(max);
}
}