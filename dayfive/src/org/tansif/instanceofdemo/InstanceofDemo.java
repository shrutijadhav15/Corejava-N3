package org.tansif.instanceofdemo;

import java.util.Scanner;

public class InstanceofDemo {
     public static void main(String[] args) {
    	 Scanner s=new Scanner(System.in);
    	 System.out.println("Enter name,address,age:");
    	 String name=s.nextLine();
    	 String address=s.nextLine();
    	 int age=s.nextInt();
    			 
    	//object creation
    	 Child c=new Child();
    	 Child c1=new Child();
    	 c1.setName(name);
    	 c1.setAddress(address);
    	 c1.setAge(age);
    	 System.out.println(c1);
    	 System.out.println(c instanceof Person);
    	 System.out.println(c1 instanceof Child);
    	 
     }
}
