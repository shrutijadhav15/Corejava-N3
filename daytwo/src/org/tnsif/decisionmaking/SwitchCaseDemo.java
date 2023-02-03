package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a song number");
		int songno=s.nextInt();
		s.close();
		
		switch(songno)
		{
		case 1:
			System.out.println("Kesariya");
		break;
		
		case 2:
			System.out.println("Rabbta");
		break;
		
		case 3:
			System.out.println("ved");
		break;

		case 4:
			System.out.println("calm down");
		break;
		
		default:
			System.out.println("invalid input");
		
		}

	}

}
