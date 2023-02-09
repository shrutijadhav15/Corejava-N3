package org.tansif.staticvariable;
//programe on demonstrate on static method

public class StaticMethod {
	
	private static double salary=4500.76;
	
	public static void display()
	{
		System.out.println("salary is:"+salary);
	}
	//getter and setter
	public static double getSalary() {
		return salary;
	}
	public   void setSalary(double salary) {
		this.salary = salary;
	}

}
