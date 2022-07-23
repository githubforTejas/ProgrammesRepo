package programmes;

import java.util.LinkedHashSet;

public class FindHowManyTimesEachNumberIsRepeated {
public static void main(String[] args) {
	int[] a= {2,3,4,2,1};
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
	System.out.println(value+"= "+count);
	}
}
}
