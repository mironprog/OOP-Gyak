

public class Rectangle {
//data members
	private int a;
	private int b;
//initialization blocks 
// ...
	
//constructors
	
	
	public Rectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public Rectangle(int sideLength){
		this(sideLength, sideLength);
	}
	
	public Rectangle(){
		this(1,1);
	}
	
	//Methods
	public void setSide(int a, int b){
		this.a = a;
		this.b = b;
	}
	//public void setLength(int sidelength){
		//setSide(sideLength, sideLength);
		
	//}
	
	public boolean hasHigherArea(Rectangle rect){
		return rect.calcArea() < this.calcArea();
	}
	
	public int calcArea(){
		return a * b;
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return a + ", " + b + ": " + calcArea();
	}
	

	public boolean sidesEquals(Rectangle rect){
		return rect.a == this.a && rect.b == this.b;
	}
	
	//inner class

}
