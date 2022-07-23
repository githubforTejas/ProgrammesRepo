package programmes;

public class Demo5 {
public static void main(String[] args) {
	int no=677177;
	int count=0;
	while(no!=0)
	{
		int rem = no%10;
		if(rem==7)
		{
			count++;
		}
		no=no/10;
	}
	System.out.println(count);
}
}
