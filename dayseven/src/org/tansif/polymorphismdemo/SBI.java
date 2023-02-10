package org.tansif.polymorphismdemo;

public class SBI extends RBI {

	float getInterest()
	 {
		System.out.println(super.getInterest());
		 return 12.8f;
	 }
//if we used method overridding in same class we get an error 
}

