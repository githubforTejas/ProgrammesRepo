package programmes;

import java.util.LinkedHashSet;

public class FindOrderOfOccurenceByRemovingDuplicates {
	public static void main(String[] args) {
		int[] a= {2,3,4,2,1};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		for(Integer value:set)
		{
			for(int j=0;j<a.length;j++)
			{
				if(value==a[j])
				{
					System.out.println(value+"="+(j+1));
					break;//if you remove this break it will give the order of occurence in the LinkedHashSet
				}
			}
		}
	}

}
