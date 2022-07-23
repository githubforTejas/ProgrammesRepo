package programmes;

public class FindMissingNumberInArray {
public static void main(String[] args) 
{
	int[] a= {1,2,3,5,6,7,8};
	int sum1=0;
	for(int i=0;i<a.length;i++)
	{
		sum1=sum1+a[i];
	}
	System.out.println("Addition of all values: "+sum1);
	int Sum2 = 0;
	for(int j=1;j<=8;j++)
	{
		Sum2=Sum2+j;
	}
	System.out.println("Addition of range of value: "+Sum2);
	
	System.out.println("Missing number in this arrya is: "+(Sum2-sum1));
}
}
