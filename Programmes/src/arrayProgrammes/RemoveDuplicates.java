package arrayProgrammes;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
public static void main(String[] args) {
	int [] a= {8,7,5,5,0,0,0,7,7};
	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		set.add(a[i]);
	}
	for(Integer value:set)
	{
		System.out.println(value);
	}
}
}
