package arrayProgrammes;

public class BothAscendingAndDescendingInOneProgramme {
public static void main(String[] args)
{
int[]  a= {7,18,11,12,8};
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
System.out.println("Ascending order");
	for(int k=0;k<a.length;k++)
	{
		System.out.println(a[k]);
	}
	System.out.println("Descending order");
	for(int l=a.length-1;l>=0;l--)
	{
		System.out.println(a[l]);
	}
}
}

