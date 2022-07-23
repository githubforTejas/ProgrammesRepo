package arrayProgrammes;

import java.util.LinkedHashSet;

public class FindUniqueNumbersInArray {
public static void main(String[] args) {
	int[] a= {8,2,3,7,5,5,7,7};
	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		set.add(a[i]);
	}
	for(Integer value:set)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(value==a[i])
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(value+"= "+count);
		}
	}
}
}
