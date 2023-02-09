package org.tansif.finalkeyword;

public class FinalMethod {
	public static void main(String [] args)
	{
		Straberry st=new Straberry();
		st.Flavours="Mixesfruit";
		st.display();
		st.setPrice(250);
		st.display(st.getPrice());
		}
	
}
