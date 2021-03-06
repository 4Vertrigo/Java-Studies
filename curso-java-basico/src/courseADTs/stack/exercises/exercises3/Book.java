package courseADTs.stack.exercises.exercises3;

public class Book {
	
	private String name;
	private String isbn;
	private String realeseDate;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(String name, String isbn, String realeseDate, String author) {
		super();
		this.name = name;
		this.isbn = isbn;
		this.realeseDate = realeseDate;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getRealeseDate() {
		return realeseDate;
	}

	public void setRealeseDate(String realeseDate) {
		this.realeseDate = realeseDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", isbn=" + isbn + ", realeseDate=" + realeseDate + ", author=" + author + "]";
	}
	
	

}
