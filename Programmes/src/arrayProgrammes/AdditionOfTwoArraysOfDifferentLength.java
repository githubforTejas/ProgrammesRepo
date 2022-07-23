package arrayProgrammes;

public class AdditionOfTwoArraysOfDifferentLength {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9};
		int count=a.length;
		if(a.length>b.length)
		{
			count=b.length;
		}
		for(int i=0;i<a.length;i++)
		{
try {
	System.out.println(a[i]+b[i]);
    }
catch(Exception e)
{
	if(a.length>b.length)
	{
		System.out.println(a[i]);
	}
	else
	{
		System.out.println(b[i]);
	}
}
		}
	}
}

