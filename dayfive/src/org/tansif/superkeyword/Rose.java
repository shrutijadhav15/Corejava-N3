package org.tansif.superkeyword;

public class Rose extends Flower {
	 private String name;
//getters and setters
	 public String getName() {
	 	return name;
	 }

	 public void setName(String name) {
	 	this.name = name;
	 }
	 //default constructor
	 public Rose() {
	 System.out.println("flower parent class");
	 }
	 //PARAMETRIZED constructor
	 public Rose(String name) {
	 	super();
	 	this.name = name;
	 }
	 //display method
	 public void display()
	 {
		 
	 System.out.println( super.getName());
}
	 
}
