package programmes;

import java.util.Scanner;

public class check {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter the Number");
	int value = sc.nextInt();
	int no=value;
	if(no%3==0)
	{
		System.out.println("Hi");
	}
	else if(no%5==0)
	{
		System.out.println("Hello");
	}
	else if(no%3==0  && no%5==0)
	{
		System.out.println("Hi Hello");
	}
	else
	{
		System.out.println("Bye");
	}
}
}
