package com.icici.loans.carloans;

public class icici implements Rbi
{

	public static void main(String[] args) {
	
		icici i =new icici();
		i.deposit();
		i.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("I am overridden withdrawl from ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println("I am overridden deposit from ICICI");
		
	}

}
