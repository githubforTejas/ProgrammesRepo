package programmes;

public class ArmstrongNumber {
public static void main(String[] args) {
	for(int j=0;j<=1000;j++)
	{
	int no=j;
	int copy=no;
	int sum=0;
	while(no!=0)
	{
		int rem = no%10;
		sum=sum+(rem*rem*rem);
		no=no/10;
	}
	
	if(sum==copy)
	{
		System.out.println(sum);
	}
	
	}
}
}
