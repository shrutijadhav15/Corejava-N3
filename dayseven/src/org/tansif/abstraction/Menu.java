package org.tansif.abstraction;
//programe to demonstrate on abstract method
public abstract class Menu {
	//abstract method
	abstract void recipe();
	abstract void foodtype();
	//concreate method
	void menutype()
	{
		System.out.println("veg and non-veg");
	}

}
