package org.tansif.polymorphismdemo;
// PROGRAM TO DEMONSTRATE ON METHOD OVERLOADING 
public class Smatphone {
	//IN TERMS OF  BY PASSING NO OF ARGUMENT
	private int resoultion;
	private String slot;
void display(int resolution )
{
	System.out.println("camera resolution:"+resolution);
}
void display(int resolution , String slot)
{
	System.out.println("camera resolution:"+resolution+"slot"+slot);
}
public int getResoultion() {
	return resoultion;
}
public void setResoultion(int resoultion) {
	this.resoultion = resoultion;
}
public String getSlot() {
	return slot;
}
public void setSlot(String slot) {
	this.slot = slot;
}
}
