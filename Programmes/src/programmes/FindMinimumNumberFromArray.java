package programmes;

public class FindMinimumNumberFromArray {
public static void main(String[] args) {
	int[] a= {50,100,40,20,60};
	int min=a[0]; //assumption
	
	for(int i=0 ;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}		
	}
	System.out.println("min num is : "+min);
}
}
