package com.prime.EnacapsulationSBI;

public class Professor {
	private int age;
	private String name,subject;
    public Professor(int age){
    	this.age=age;
    	System.out.println("Age :"+age);
    }

public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

//    public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	



}
