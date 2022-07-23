package programmes;

public class BubbleSortByShankar {
public static void main(String[] args) {
	int [] arr= {95,21,34,2,87};
	for(int j=1;j<arr.length;j++)
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]>arr[i])
			{
				int temp=arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
		}
	}
	for(int k=0;k<arr.length;k++)
	{
		System.out.println(arr[k]);
	}
}
}
