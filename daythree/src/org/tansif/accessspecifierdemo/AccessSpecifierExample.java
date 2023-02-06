package org.tansif.accessspecifierdemo;

public class AccessSpecifierExample {
	//data member
	private String name;
	public void display()
	{
		System.out.println("The name is: "+name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
