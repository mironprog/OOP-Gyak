package main;

import java.awt.Color;

public class Pen extends Product {
	
	private Color color;
	private String brand;
	
	public Pen(String brand, Color color, int price){
		super("Pen", price, 27);
		this.color = color;
		this.brand = brand;
	}

}
