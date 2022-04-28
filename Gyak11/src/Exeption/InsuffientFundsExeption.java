package Exeption;

public class InsuffientFundsExeption extends Exception{
	
	private int missingFunds;

	public InsuffientFundsExeption(int missingFunds) {
		super();
		this.missingFunds = missingFunds;
	}

	public int getMissingFunds() {
		return missingFunds;
	}

	
	
	
}
