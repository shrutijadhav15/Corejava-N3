package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a age and weight for a person");
		int age=s.nextInt();
		int weight=s.nextInt();
        if(age>12)
        {
        	if(weight>40)
        	{
        		if(weight<120)
        		{
        			System.out.println("Eligiable for benjee jumping");
        		}
        		else
        		{
        			System.out.println("extra ropes will be added");	
        		}	
        	}
        	else
    		{
    			System.out.println("not eligiable for bunjee jumping");	
    		}
        }
        
        else
        {
        	System.out.println("not eligiable for banjee jumping");
        	s.close();
        }
	}

}
