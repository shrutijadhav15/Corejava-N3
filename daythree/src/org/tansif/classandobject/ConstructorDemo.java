package org.tansif.classandobject;

import java.util.Scanner;

//driver class
public class ConstructorDemo {
 public static void main( String[] args){
	//Customer c=new  Customer(1 ,"shruti" ,"nashik") ;
	 //c.display();
	 Scanner s=new Scanner(System.in);
	 int n=1;
	 while(n<=3)
	 {

	//cutomer 1
			System.out.println("enter the id , name , city: ");
			int id;
		    String custname;
			String city;
			
			id=s.nextInt();
			s.nextLine();
			city=s.nextLine();
			custname=s.nextLine();
			
			Customer c=new Customer();
			c.setId(id);
			c.setCity(city);
			c.setCustname(custname);
			//c.display();
			System.out.println(c.getId());
			System.out.println(c.getCustname());
			System.out.println(c.getCity());
			
			n++;
	 }
	 }
	 
			
			/* //cutomer 2
			System.out.println("enter the id , name , city: ");
			int id1;
		    String custname1;
			String city1;
			
			id1=s.nextInt();
			s.nextLine();
			city1=s.nextLine();
			custname1=s.nextLine();
		
			Customer c1=new Customer(id1,city1,custname1);
			//c1.setId(id1);
			//c1.setCity(city1);
			//c1.setCustname(custname1);
			//c1.display();
			System.out.println(c1.getId());
			System.out.println(c1.getCustname());
			System.out.println(c1.getCity());
			
			
			//cutomer 3
			System.out.println("enter the id , name , city: ");
			int id2;
		    String custname2;
			String city2;
			
			id2=s.nextInt();
			s.nextLine();
			city2=s.nextLine();
			custname2=s.nextLine();
			s.close();
			Customer c2=new Customer(id2,city2,custname2);
			//c2.setId(id2);
			//c2.setCity(city2);
			//c2.setCustname(custname2);
			//c2.display();
			System.out.println(c2.getId());
			System.out.println(c2.getCustname());
			System.out.println(c2.getCity());*/
		
 
		}

