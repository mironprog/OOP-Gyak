package products;

public class Bread extends Product{
	
	private double amount;
	
	@Override
	public double unitPrice(){
		return getGrossPrice() / amount;
	}

    public Bread(String name, int netPrice, int vat, double amount) {
        super(name, netPrice, vat);
        this.amount = amount;
    }

    public static boolean compareBreads(Bread b1, Bread b2) {
        return b1.getGrossPrice() < b2.getGrossPrice();
    }

    @Override
    public String toString() {
        return "Bread [amount=" + amount + ", price=" + getGrossPrice() + ", name=" + getName() + ", netPrice="
                + getNetPrice() + ", vat=" + getVat() + "]";
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
