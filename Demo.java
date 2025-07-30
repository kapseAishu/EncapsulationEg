package com.prime.EnacapsulationSBI;

public class Demo {
public static void main(String []args) {
	System.out.println("=========1 prof=======");
	Professor p=new Professor(40);
	p.setName("Aishwarya");
	p.setSubject("Java");
	System.out.println("Name:"+p.getName());
	System.out.println("Subject:"+p.getSubject());
	
	System.out.println("========2 prof=======");
	Professor p1=new Professor(35);
	p1.setName("Sai");
	p1.setSubject("C++");
	System.out.println("Name:"+p1.getName());
	System.out.println("Subject:"+p1.getSubject());
	
}
}
