package org.tansif.polymorphismdemo;
// program to demonstrate on constructor overloading
public class HondaCity {
private int speed;
private String color;
//getters and setters
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
//constructor overloading default constructor
public HondaCity() {
	super();
	// TODO Auto-generated constructor stub
	System.out.println("i like hondacity color"+color);
}

//constructor with parameter
//constructor overloading
public HondaCity(int speed, String color) {
	super();
	this.speed = speed;
	this.color = color;
	System.out.println("speed is:"+speed+","+"color is"+color);
}

}
