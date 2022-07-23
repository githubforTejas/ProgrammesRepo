package programmes;

import java.util.Arrays;

public class FindEqualityOfArrays {
public static void main(String[] args) {
	int [] a= {1,2,3,4,5};
	int [] b= {1,2,3,4,5};
	boolean check = Arrays.equals(a, b);
	if(check==true)
	{
		System.out.println("these two arrays are equal");
	}
	else
	{
		System.out.println("Are not equal");
	}
}
}
