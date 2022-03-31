package products;

public abstract class Product {
    private String name;
    private int netPrice;
    private int vat;
    
    public abstract double unitPrice();

    public int getGrossPrice() {
        double vatAmount = ((double) vat / 100.0) * netPrice;
        return (int) (vatAmount + netPrice);
    }

    public void increaseNetPrice(int percent) {
        netPrice += netPrice * (percent / 100.0);
    }

    public int comapreGrossPrice(Product other) {
        if (this.getGrossPrice() > other.getGrossPrice()) {
            return 1;
        } else if (this.getGrossPrice() == other.getGrossPrice()) {
            return 0;
        } else {
            return -1;
        }
    }

    public Product(String name, int netPrice, int vat) {
        super();
        this.name = name;
        this.netPrice = netPrice;
        this.vat = vat;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", netPrice=" + netPrice + ", vat=" + vat + ", grossPrice=" + getGrossPrice()
                + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(int netPrice) {
        this.netPrice = netPrice;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

}