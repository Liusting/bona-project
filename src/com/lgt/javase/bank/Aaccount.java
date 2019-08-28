package com.lgt.javase.bank;

public class Aaccount {
	
	private double balance;
	
	public Aaccount(double init_balance) {
		balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		
		balance += amt;
		
	}
	
	public void withdraw(double amt) {
		
		balance -= amt;
	}
	
	

}
