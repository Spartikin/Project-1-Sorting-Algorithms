import java.util.*;

public class main {
	
	// Enum for ratings
	// Used by Book & Multimedia
	enum Rating {
	    G,
	    PG,
	    PG_13,
	    R
	}
	
	// Class for Book
	static class Book {
	    private String title;
	    private String author;
	    private String genre;
	    private int pageCount;
	    private int publicationYear;
	    private int edition;
	    private Rating rating;
	    
	    // Book Constructor
	    public Book(String title, String author, String genre, int pageCount, int publicationYear, int edition, Rating rating) {
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
	static class Multimedia {
	    private String title;
	    private String authorPublisher;
	    private String type;
	    private String lengthDuration;
	    private int publicationYear;
	    private int edition;
	    private Rating rating;
	    
	    // Multimedia Constructor
	    public Multimedia(String title, String authorPublisher, String type, String lengthDuration, int publicationYear, int edition, Rating rating) {
	        this.title = title;
	        this.authorPublisher = authorPublisher;
	        this.type = type;
	        this.lengthDuration = lengthDuration;
	        this.publicationYear = publicationYear;
	        this.edition = edition;
	        this.rating = rating;
	    }
	}
	
	// Class for Library
	class Library {
	}

	public static void main(String[] args) {
		Book Book1 = new Book("bob", "james", "Crime", 3, 434, 4343, Rating.PG_13);
		System.out.println(Book1.author);
		Multimedia M1 = new Multimedia("bob", "james", "Crime", "3", 434, 4343, Rating.PG);
		System.out.println(M1.authorPublisher);
	}

}
