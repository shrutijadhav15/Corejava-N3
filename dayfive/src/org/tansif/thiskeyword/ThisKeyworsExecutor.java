package org.tansif.thiskeyword;

class HR
{
	void display(HR obj)
	{
		System.out.println("human resource");
	}
	void accept()
	{
		display(this);
	}
}
	public class ThisKeyworsExecutor {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HR obj=new HR();

		obj.accept();

	}

}
