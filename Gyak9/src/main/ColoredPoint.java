package main;

import java.awt.Color;

import Gyak9.Colorable;

public class ColoredPoint extends Point implements Colorable {
	
	private Color color;
	
	
	public ColoredPoint(){
		//super(0, 0);
		this(0, 0, Colorable.defaultColor);
		//this.color = Colorable.defaultColor;
	}
	
	public ColoredPoint(Color color){
		this(0, 0, color);
		//super(0, 0);
		this.color = color;
	}
	
	public ColoredPoint(int x, int y, Color color){
		super(x, y);
		this.color = color;
	}
	
	
	
	@Override
	public String toString() {
		return "ColoredPoint [color=" + color + "]";
	}

	@Override
	public Color getColor() {
		
		return color;
	}

	@Override
	public void setColor(Color color) {
		this.color = color;
		
	}
	
	

	
	
	
}
