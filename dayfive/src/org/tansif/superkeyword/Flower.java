package org.tansif.superkeyword;

public class Flower {
 private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//default
public Flower() {
System.out.println("flower parent class");
}
//PARAMETRIZED
public Flower(String name) {
	super();
	this.name = name;
}
 
}
