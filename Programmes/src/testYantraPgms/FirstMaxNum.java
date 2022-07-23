package testYantraPgms;

public class FirstMaxNum {
public static void main(String[] args) {
	int [] a= {12,54,76,23,2,5};
	int max=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("First maximum number is "+max);
}
}
