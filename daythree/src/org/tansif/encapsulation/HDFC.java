package org.tansif.encapsulation;

public class HDFC {
	private int pin;
	void accept()
	{
		System.out.println("The ATM PIN is:"+pin);
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	

}
