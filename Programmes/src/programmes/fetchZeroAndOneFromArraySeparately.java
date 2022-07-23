package programmes;

public class fetchZeroAndOneFromArraySeparately {
	public static void main(String[] args) {
		int [] a= {1,0,0,1,0};
		System.out.println("Ones");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Zeros");
		for(int j=0;j<a.length;j++)
		{
			if(a[j]==0)
			{
				System.out.println(a[j]);
			}
		}
	}
}
