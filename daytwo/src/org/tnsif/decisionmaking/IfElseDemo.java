package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
        if(a>b)
        	System.out.println("a is greater to b");
        else
        	System.out.println("a is not greater to b");
        	s.close();
		

	}

}
