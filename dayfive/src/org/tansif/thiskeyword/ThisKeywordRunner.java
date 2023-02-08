package org.tansif.thiskeyword;
class Math
{
	int a,b;
	Math()
	{
		a=10;
		b=30;
		
	}
	void display()
	{
		System.out.println("a is:"+a);
		System.out.println("b is:"+b);
	}
	
}
public class ThisKeywordRunner {
public static void main (String[] args)
{
	Math m=new Math();
	m.display();
}
}
