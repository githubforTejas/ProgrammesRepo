package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Prog3 {
public static void main(String[] args) {
	ArrayList li=new ArrayList();
	li.add(10);
	li.add(40);
	li.add(5);
	li.add(25);
	li.add(47);
	System.out.println("Before sorting");
	System.out.println(li);
	
	System.out.println("After sorting");
	Collections.sort(li);
	System.out.println(li);
	
	//System.out.println("After reversing");
	
}
}
