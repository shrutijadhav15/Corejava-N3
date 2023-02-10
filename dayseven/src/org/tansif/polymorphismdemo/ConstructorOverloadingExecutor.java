package org.tansif.polymorphismdemo;

import java.util.Scanner;

public class ConstructorOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the speed and color of"+" hondacity"); 
		int speed=s.nextInt();
		s.nextLine();
		String color=s.nextLine();
		HondaCity h=new HondaCity();
		HondaCity h1=new HondaCity(speed,color);
		

	}

}
