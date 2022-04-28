package myPackage;

import Exeption.InsuffientFundsExeption;

public class BankAccount {
	
	private String accountNumber;
	private int funds = 0;
	
	
	
	public BankAccount(String accountNumber){
		
		this.accountNumber = accountNumber;
	}
	
	public void raiseFunds(int raise){
		this.funds += raise;
	}
	
	public void takeFunds(int takeaway) throws InsuffientFundsExeption {
		if(takeaway > funds){
			throw new InsuffientFundsExeption(Math.abs(funds-takeaway));
		}
		funds -= takeaway;
	}

	public int getFunds() {
		return funds;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", funds=" + funds + "]";
	}
	
	


	
	
	

}
