package arrayProgrammes;

public class DescendingOrderBubbleSort {
public static void main(String[] args) {
	int [] b= {23,87,4,35,90,67};
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if(b[i]<b[j])
			{
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	for(int k=0;k<b.length;k++)
	{
		System.out.println(b[k]);
	}
}
}
