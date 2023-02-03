package org.tansif.operators;

import java.util.Scanner;

public class OperatorDemo {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value for X and Y");
		int x=s.nextInt();
		int y=s.nextInt();
		//Arithmatic operator
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		//relational operator
		boolean res=x>y;
		System.out.println(res);
		
		//assignment operator 
		x*=y;
		System.out.println(x);
		
		//logical operator
		boolean res2= (5==5)&&(5>3);
		boolean res3= (5==5)||(5>3);
		boolean res4= !(5==4);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		
		//bitwise operator
		int a=12, b=5;
		int c=12^5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//ternary operator
		String res1=(13%2==0)?"Even":"Odd";
		System.out.println(res1);
		
		//increment and decrement
		int p=x++;
		int q=--x;
		System.out.println(p);
		System.out.println(q);
		
		

	}

}
