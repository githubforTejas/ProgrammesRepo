package arrayProgrammes;

import java.util.LinkedHashSet;

public class FindPositionByRemovingDuplicates {
public static void main(String[] args) {
	int[] a= {8,2,3,7,5,5,7,7};
	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		set.add(a[i]);
	}
	for(Integer value:set)
	{
		for(int i=0;i<a.length;i++)
		{
			if(value==a[i])
			{
				System.out.println(value+"= "+i);
				break;//remove this break and see the result
			}
		}
	}
}
}
