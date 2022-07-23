package arrayProgrammes;

public class FirstMax {
public static void main(String[] args) {
	int [] a= {8,7,5,6};
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(max);
}
}
