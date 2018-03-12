
public class Book {
	public String isbn;
	public String name;
	public Author author;
	public double price;
	public int qty = 0;
	
	public Book(String isbn,String name,Author author,double price) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book(String isbn,String name,Author author,double price,int qty) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getISBN() {
		return isbn;
	}
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String getAuthorName() {
		return author.getName();
	}
	
	public String toString() {
		return String.format("Book[isbn=%s,name=%s,%s,price=%.1f,qty=%d]", isbn,name,author.toString(),price,qty);
	}
}
