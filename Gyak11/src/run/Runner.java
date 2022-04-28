package run;

import Exeption.InsuffientFundsExeption;
import myPackage.BankAccount;

public class Runner {

	public static void main(String[] args) {

		
		BankAccount bankAccount = new BankAccount("123");
		
		bankAccount.raiseFunds(10);
		
		System.out.println(bankAccount);
		
		try{
			bankAccount.takeFunds(5);
			System.out.println(bankAccount);
			bankAccount.takeFunds(15);
		}catch(InsuffientFundsExeption e){
			System.out.println("Not enough funds. Missing: " + e.getMissingFunds());
		}
		
		System.out.println(bankAccount);

	}

}
