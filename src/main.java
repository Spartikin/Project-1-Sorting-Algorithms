/**
File: main.java
Description: Allows for the creation and sorting of a library, consisting of books and multimedia items.
Author: Nicholas Tripodi-Baslis
Student ID: 110316926
Email ID: triny012
AI Tool Used: Y (This includes all AI Tools e.g. ChatGPT, Microsoft or Github Copiliot etc... Please leave blank if you do not wish to share this information)
This is my own work as defined by
the University's Academic Integrity Policy.
**/


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
	    
	    // Book toString()
	    @Override
	    public String toString() {
	        return title + " by " + author + " (Edition: " + edition + ")";
	    }
	    
	    // Book hashCode()
	    @Override
	    public int hashCode() {
	        return Objects.hash(title, edition);
	    }
	    
	    // Book equals()
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Book)) return false;
	        Book other = (Book) obj;
	        return this.title.equals(other.title) && this.edition == other.edition;
	    }
	    
	    // return title
	    public String getTitle() {
	        return title;
	    }
	    
	    // return edition
	    public int getEdition() {
	        return edition;
	    }
	    
	    // return author
	    public String getAuthor() {
	        return author;
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
	    
	    // Multimedia toString()
	    @Override
	    public String toString() {
	        return title + " by " + authorPublisher + " (Edition: " + edition + ")";
	    }
	    
	    // Multimedia hashCode()
	    @Override
	    public int hashCode() {
	        return Objects.hash(title, edition);
	    }
	    
	    // Multimedia equals()
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Multimedia)) return false;
	        Multimedia other = (Multimedia) obj;
	        return this.title.equals(other.title) && this.edition == other.edition;
	    }
	}
	
	// Class for Library
	class Library <T> {
		private List<T> library;
		
	    // Library Constructor
	    public Library() {
	        this.library = new ArrayList<>();
	    }
	    
	    // Library add item function
	    public void addItem(T item) {
	        library.add(item);
	    }
	    
	    
	}

	public static void main(String[] args) {
		Book Book1 = new Book("bob", "james", "Crime", 3, 434, 4343, Rating.PG_13);
		System.out.println(Book1.author);
		Multimedia M1 = new Multimedia("bob", "james", "Crime", "3", 434, 4343, Rating.PG);
		System.out.println(M1.authorPublisher);
		System.out.println(Book1.toString());
		System.out.println(M1.toString());
	}

}
