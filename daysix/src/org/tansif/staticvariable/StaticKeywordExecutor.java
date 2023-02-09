package org.tansif.staticvariable;

public class StaticKeywordExecutor {
//driver class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable s=new StaticVariable("shruti jadhav"); 
        System.out.println(s);
        //use classname.varname to print static variable
        System.out.println(StaticVariable.companyname);
	}

}
