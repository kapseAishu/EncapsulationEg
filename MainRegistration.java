package com.prime.EnacapsulationSBI;

public class MainRegistration {

	public static void main(String[] args) {
		System.out.println("==========================1 person=====================");
		SBIAccountRegistration s=new SBIAccountRegistration(123456789);
		s.setAccount_holder("Ais");
		s.setAdharno(2323434566l);
		System.out.println("Account_holder name:"+s.getAccount_holder());
		System.out.println("Adhar number:"+s.getAdharno());
		
		System.out.println("==========================2 person=====================");
		SBIAccountRegistration s1=new SBIAccountRegistration(456782394);
		s1.setAccount_holder("Jagadeesh");
		s1.setAdharno(343456644455l);
		System.out.println("Account_holder name:"+s1.getAccount_holder());
		System.out.println("Adhar number:"+s1.getAdharno());
	}

}
