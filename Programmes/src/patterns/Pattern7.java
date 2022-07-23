package patterns;

public class Pattern7 {
public static void main(String[] args) {
	int k=16;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
			System.out.print(k+" ");
			k--;
		}
		System.out.println();
	}
}
}
