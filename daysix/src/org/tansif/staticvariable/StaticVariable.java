package org.tansif.staticvariable;

public class StaticVariable {
	//non static constructor
	public String name;
	//static constructor
     public static String companyname="TNS";
	
	public StaticVariable(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "StaticVariable [name=" + name + "]";
	}

}
