package Sajat;

//import java.util.Date;

public class Book {
	private String author;
	private String title;
	private int yearOfPublication;
	private int price;
	private int pageNumber;
	private String publisher = "Móra";
	
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
	
	public void book(String author, String title, int yearOfPublication, int price, int pageNumber) {
		
		this.author = author;
		this.title = title;
		this.yearOfPublication = yearOfPublication;
		this.price = price;
		this.pageNumber = pageNumber;
		
	}
	
	public void book2(String author, String title, int price, int yearOfPublication, int pageNumber) {
		this.author = author;
		this.title = title;
		this.price = 2500;
		java.time.LocalDate currentDate = java.time.LocalDate.now(); 
		this.yearOfPublication = currentDate.getYear();
		this.pageNumber = pageNumber;
		
		
	}
	
	public static void hasMorePages(Book book1, Book book2) {
		
		System.out.println(Math.max(book1.pageNumber, book2.pageNumber));
	}
	
	public boolean isEven(Book book1) {
		
		if(book1.pageNumber % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	@Override
	public String toString(){
		return author + " - " + title + " - " + price + " - " + yearOfPublication + "- " + pageNumber + "- " + publisher;
	}

}