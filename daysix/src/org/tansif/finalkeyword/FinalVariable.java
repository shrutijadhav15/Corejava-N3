package org.tansif.finalkeyword;

public class FinalVariable {

	final static  int x=15;
	public static void print()
	{
		//WE CANT CHANGE THE VALUE OF X AS X IS DECLARED IS FINAL
		System.out.println(" the value of xis:"+x);	
	}
 public static void main(String[] args)
{
	 FinalVariable.print();
			 
}
	
}
