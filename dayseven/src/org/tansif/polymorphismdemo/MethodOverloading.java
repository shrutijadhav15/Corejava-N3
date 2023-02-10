package org.tansif.polymorphismdemo;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the camera resolution and slot"+ "of a cellphone:"); 
              int resolution=s.nextInt();
              s.nextLine();
              String slot=s.nextLine();
               Smatphone sp=new Smatphone();
              sp.setResoultion(resolution);
              sp.setSlot(slot);
              sp.display(resolution);
              sp.display(resolution, slot);
              
          Multiplication m=new Multiplication();
          System.out.println(m.mul(11,7));
          System.out.println(m.mul(23.3f, 6));
	}

}
