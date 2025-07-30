package com.prime.EnacapsulationSBI;

public class SBIAccountRegistration {
	private String account_holder;
	private long adharno,accno;
	public SBIAccountRegistration(long accno){
		this.accno=accno;
		System.out.println("Account number"+accno);
	}
	public String getAccount_holder() {
		return account_holder;
	}
	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	
	

}
