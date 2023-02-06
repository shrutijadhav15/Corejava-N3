package org.tansif.homework;

import java.util.Scanner;

public class TotalDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0 , digit=456;//456,3
		while(digit !=0)
		{
			digit/=10;
			 ++count;
		}
		System.out.println("number contains digit:"+count);

	}

}