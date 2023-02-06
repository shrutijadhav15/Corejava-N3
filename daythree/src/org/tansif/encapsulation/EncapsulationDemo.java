package org.tansif.encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setPin(42203);
		System.out.println(h.getPin());
		h.accept();
		
	}
	
	

}
