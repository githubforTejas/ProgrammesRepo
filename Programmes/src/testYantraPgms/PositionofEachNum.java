package testYantraPgms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PositionofEachNum {
	public static void main(String[] args) {
		
int [] a= {5,4,3,3,2,1,1,0};
int position=0;
LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
for(int i=0;i<a.length;i++)
{
	set.add(a[i]);
}
for(Integer in:set)
{
	for(int i=0;i<a.length;i++)
	{
	if(a[i]==in)
	{
		position++;
	}
	}
	System.out.println(in+" :"+position);
}
}
}