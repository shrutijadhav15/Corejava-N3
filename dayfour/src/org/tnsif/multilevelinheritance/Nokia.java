package org.tnsif.multilevelinheritance;

public class Nokia {

	//to demonstrate an example on multilevel inheritance
	//parent1 class

		
		//private data members
		private int modelno;
		public void display()
		{
			System.out.println("The Model no.is: "+modelno);
		}
		//default constructor
		public Nokia() {
			System.out.println("Nokia Class");
		}
		//parameterized constructor
		public Nokia(int modelno) {
			super();
			this.modelno = modelno;
		}
		
		//getters and setters
		public int getModelno() {
			return modelno;
		}
		public void setModelno(int modelno) {
			this.modelno = modelno;
		}
}
		
		

	
