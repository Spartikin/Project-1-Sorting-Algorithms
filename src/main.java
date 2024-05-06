
public class main {
	
	// Class for Book
	static class Book {
	    private String title;
	    private String author;
	    private String genre;
	    private int pageCount;
	    private int publicationYear;
	    private int edition;
	    private String rating;
	    
	    // Constructor
	    public Book(String title, String author, String genre, int pageCount, int publicationYear, int edition, String rating) {
	        this.title = title;
	        this.author = author;
	        this.genre = genre;
	        this.pageCount = pageCount;
	        this.publicationYear = publicationYear;
	        this.edition = edition;
	        this.rating = rating;
	    }
	}

	
	
	// Class for Multimedia
	class Multimedia {
	}
	
	// Class for Library
	class Library {
	}

	public static void main(String[] args) {
		Book Book1 = new Book("bob", "james", "Crime", 3, 434, 4343, "Tim");
		System.out.println(Book1.author);
	}

}
