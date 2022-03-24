package myproducts;

public class Bread extends products {
	private double amount;
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Bread(String name, int netPrice, int aKey, double amount){
		super(name, netPrice, aKey);
		this.amount = amount;
	}
	
	public double calcUnitPrice(){
		return super.grossPrice() / amount;
	}
	
	@Override
	public String toString(){
		return super.toString() + " - " + (super.grossPrice() / amount);
		
	}
	
	public static boolean cmpUnitPrice(Bread bread1, Bread bread2){
		return bread1.calcUnitPrice() > bread2.calcUnitPrice();
	}
}
