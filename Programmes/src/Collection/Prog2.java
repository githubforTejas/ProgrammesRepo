package Collection;

import java.util.TreeSet;

public class Prog2 {
public static void main(String[] args) {
	TreeSet tree=new TreeSet();
	tree.add("Kohli");
	tree.add("Dhoni");
	tree.add("Abd");
	tree.add("Rahul");
	
	for(Object value:tree)
	{
		System.out.println(value);
	}
	
}
}
