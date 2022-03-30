package homework;

//import java.util.Date;

public class Book {
	private String author;
	private String title;
	private int yearOfPublication;
	private int price;
	
	public void increasePrice(int percentage) {
		if (percentage > 0) {
			price += Math.round(price*(float)percentage/100);
		}	
	}
	
	public String displayInfo() {
		return author + ": " + title + ", " + yearOfPublication + ". Price: " + price + " Ft";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		if (yearOfPublication >= 1950 && yearOfPublication <= 2021)
			this.yearOfPublication = yearOfPublication;
		else 
			this.yearOfPublication = 2021;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price >= 1000)
			this.price = price;
		else
			this.price = 1000;
	}
	
	public void book(String author, String title, int yearOfPublication, int price) {
		
		this.author = author;
		this.title = title;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
	}
	
	public void book2(String author, String title, int price, int yearOfPublication) {
		this.author = author;
		this.title = title;
		this.price = 2500;
		java.time.LocalDate currentDate = java.time.LocalDate.now(); 
		this.yearOfPublication = currentDate.getYear();
	}
	
	@Override
	public String toString(){
		return author + " - " + title + " - " + price + " - " + yearOfPublication;
	}

}