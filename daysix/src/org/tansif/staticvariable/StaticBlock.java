package org.tansif.staticvariable;

public class StaticBlock {
	//non static variable
	private int num;
	//static variable
	private static String  name;
	//static block is use to initaialized the static variable
	static {
	 name="shruti";
	}
	
	//grtters and setters
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		StaticBlock.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

}
