package programmes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SumOfElementsInAnArray {
	public static void main(String[] args) {
		int[] a= {5,2,7,9,6};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);



		//By using for-each loop

		//	for(int value:a)
		//	{
		//		sum=sum+value;
		//	}
		//	System.out.println(sum);
		ArrayList<Object> l=new ArrayList<Object>();
		l.add(10);
		l.add(30);
		l.add(20);
		l.add(100);
		l.add(111);
		l.add(1);
		System.out.println(l);
		HashSet s=new HashSet();
		s.add(10);
		s.add('a');
		s.add(10);
		s.add("Tejas");
		s.add(null);
		s.add(null);
		System.out.println(s);

		TreeSet tree=new TreeSet(l);
//		tree.add(10);
//		tree.add(20);
//		tree.add(10);
//		tree.add(40);
//		tree.add(50);
//		tree.add(1000);
		System.out.println(tree);

		LinkedList list=new LinkedList();
		list.add(10);
		list.add(23);
		list.add('a');
		list.add("String");
		list.add(null);
		list.add(null);
		System.out.println(list);

		LinkedHashSet hash=new LinkedHashSet();
		hash.add(10);
		hash.add(23);
		hash.add('a');
		hash.add("String");
		hash.add(null);
		hash.add(null);
		System.out.println(hash);
		
		LinkedList lis=new LinkedList(tree);
		System.out.println(lis);
	}
}
