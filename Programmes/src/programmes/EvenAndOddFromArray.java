package programmes;

public class EvenAndOddFromArray {
public static void main(String[] args) {
	int [] a= {10,7,3,5,4,8,12};
	System.out.println("Even numbers from the array...........");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
	}
	
	System.out.println("Odd numbers from the array........");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.println(a[i]);
		}
	}
}
}
