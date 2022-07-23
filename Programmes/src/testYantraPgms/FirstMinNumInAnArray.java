package testYantraPgms;

public class FirstMinNumInAnArray {
public static void main(String[] args) {
	int [] a= {15,65,98,2,54};
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("Minimum number is "+min);
}
}
