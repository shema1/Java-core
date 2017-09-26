package java_core_12_homework;

public class Book {
	
	private String nameBook;
	private int ageBook;
	private int quantityPage;
	
	
	Book(){
		
	}
	@Override
	public String toString() {
		return "Book [nameBook=" + nameBook + ", ageBook=" + ageBook + ", quantityPage=" + quantityPage + "]";
	}
	public Book(String nameBook, int ageBook, int quantityPage) {
		super();
		this.nameBook = nameBook;
		this.ageBook = ageBook;
		this.quantityPage = quantityPage;
	}
	public String getNameBook() {
		return nameBook;
	}
	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}
	public int getAgeBook() {
		return ageBook;
	}
	public void setAgeBook(int ageBook) {
		this.ageBook = ageBook;
	}
	public int getQuantityPage() {
		return quantityPage;
	}
	public void setQuantityPage(int quantityPage) {
		this.quantityPage = quantityPage;
	}

	
}
