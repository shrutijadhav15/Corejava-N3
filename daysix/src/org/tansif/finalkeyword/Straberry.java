package org.tansif.finalkeyword;

public class Straberry extends Cake {
	private int price;
	final void display(int price)
	{
		System.out.println("the price is:"+price);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

	/*if any method declared as a final in parent class  and we are going to used method inside the class*/

}
