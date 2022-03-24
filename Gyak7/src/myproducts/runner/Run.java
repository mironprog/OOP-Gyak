package myproducts.runner;

import myproducts.products;
import myproducts.Bread;

public class Run {

	public static void main(String[] args) {
		products products = new products("Hello kitty doll", 1000, 27);
		Bread bread = new Bread("Vitajo", 500, 27, 0.5);
		System.out.println(products);
		System.out.println(bread);
		int tmp = bread.cmpGrossPrice(products);
		System.out.println(tmp);
		int tmp2 = products.cmpGrossPrice(bread);
		System.out.println(tmp2);
		
		//products products2 = new Bread("occo", 1, 27, 0.5);
		//Bread bread2 = new products("ccc", 250, 22); 
		
		Object c = new Object();
		Object c2 = new Bread("occo", 1, 27, 0.5);
		products product2 = new products("ccc", 250, 22);
		((Bread)product2).getAmount();
		
	}

}
