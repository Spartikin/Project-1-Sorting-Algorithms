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
	
    /**
     * Rating for Book/Multimedia.
     * Can be G, PG, PG_13, R
     */
	enum Rating {
	    G,
	    PG,
	    PG_13,
	    R
	}
	
    /**
     * Book object.
     */
	static class Book {
	    private String title;
	    private String author;
	    private String genre;
	    private int pageCount;
	    private int publicationYear;
	    private int edition;
	    private Rating rating;
	    
        /**
         * Constructs a Book object.
         * @param title The title of the book.
         * @param author The author of the book.
         * @param genre The genre of the book.
         * @param pageCount The page count of the book.
         * @param publicationYear The publication year of the book.
         * @param edition The edition of the book.
         * @param rating The rating of the book.
         */
	    public Book(String title, String author, String genre, int pageCount, int publicationYear, int edition, Rating rating) {
	        this.title = title;
	        this.author = author;
	        this.genre = genre;
	        this.pageCount = pageCount;
	        this.publicationYear = publicationYear;
	        this.edition = edition;
	        this.rating = rating;
	    }
	    
	    /**
	     * Book toString().
	     * @return String of title, author & edition
	     */
	    @Override
	    public String toString() {
	        return title + " by " + author + " (Edition: " + edition + ")";
	    }
	    
	    /**
	     * Book hashCode().
	     * @return hash of this.title & this.edition.
	     */
	    @Override
	    public int hashCode() {
	        return Objects.hash(title, edition);
	    }
	    
	    /**
	     * Book equals().
	     * @param obj book object to compare.
	     * @return True is equals, false is not equal
	     */
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Book)) return false;
	        Book other = (Book) obj;
	        return this.title.equals(other.title) && this.edition == other.edition;
	    }
	    
	    /**
	     * Book getTitle()
	     * @return String title
	     */
	    public String getTitle() {
	        return title;
	    }
	    
	    /**
	     * Book getEdition()
	     * @return int edition
	     */
	    public int getEdition() {
	        return edition;
	    }
	    
	    /**
	     * Book getAuthor()
	     * @return String author
	     */
	    public String getAuthor() {
	        return author;
	    }
	    
	    /**
	     * Book getRating()
	     * @return Rating rating
	     */
	    public Rating getRating() {
	        return rating;
	    }
	    
	}
	
    /**
     * Multimedia object.
     */
	static class Multimedia {
	    private String title;
	    private String authorPublisher;
	    private String type;
	    private String lengthDuration;
	    private int publicationYear;
	    private int edition;
	    private Rating rating;
	    
        /**
         * Constructs a Multimedia object.
         * @param title The title of the media.
         * @param authorPublisher The author/publisher of the media.
         * @param type The type of the media.
         * @param lengthDuration The length of the media.
         * @param publicationYear The publication year of the media.
         * @param edition The edition of the media.
         * @param rating The rating of the media.
         */
	    public Multimedia(String title, String authorPublisher, String type, String lengthDuration, int publicationYear, int edition, Rating rating) {
	        this.title = title;
	        this.authorPublisher = authorPublisher;
	        this.type = type;
	        this.lengthDuration = lengthDuration;
	        this.publicationYear = publicationYear;
	        this.edition = edition;
	        this.rating = rating;
	    }
	    
	    /**
	     * Multimedia toString().
	     * @return String of title, authorPublisher & edition
	     */
	    @Override
	    public String toString() {
	        return title + " by " + authorPublisher + " (Edition: " + edition + ")";
	    }
	    
	    /**
	     * Multimedia hashCode().
	     * @return hash of this.title & this.edition.
	     */
	    @Override
	    public int hashCode() {
	        return Objects.hash(title, edition);
	    }
	    
	    /**
	     * Multimedia equals().
	     * @param obj Multimedia object to compare.
	     * @return True is equals, false is not equal
	     */
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Multimedia)) return false;
	        Multimedia other = (Multimedia) obj;
	        return this.title.equals(other.title) && this.edition == other.edition;
	    }
	    
	    /**
	     * Multimedia getTitle()
	     * @return String title
	     */
	    public String getTitle() {
	        return title;
	    }
	    
	    /**
	     * Multimedia getEdition()
	     * @return int edition
	     */
	    public int getEdition() {
	        return edition;
	    }
	    
	    /**
	     * Multimedia getAuthor()
	     * @return String author
	     */
	    public String getAuthor() {
	        return authorPublisher;
	    }
	    
	    /**
	     * Multimedia getRating()
	     * @return Rating rating
	     */
	    public Rating getRating() {
	        return rating;
	    }
	}
	
	// Class for Library
	static class Library <T> {
		private List<T> library;
		
	    // Library Constructor
	    public Library() {
	        this.library = new ArrayList<>();
	    }
	    
	    // Library add item function
	    public void addItem(T item) {
	        library.add(item);
	    }
	    
	    // search library by string, compare to item string
	    public void searchLibraryByTitle(String keyword) {
	        System.out.println("Matching Items:");
	        for (T item : library) {
	            if (item instanceof Book) {
	                Book book = (Book) item;
	                if (book.getTitle().toLowerCase().startsWith(keyword.toLowerCase())) {
	                    System.out.println(book);
	                }
	            } else if (item instanceof Multimedia) {
	                Multimedia multimedia = (Multimedia) item;
	                if (multimedia.getTitle().toLowerCase().startsWith(keyword.toLowerCase())) {
	                    System.out.println(multimedia);
	                }
	            }
	        }
	    }
	    
        // Sort library by lexicographical title, then by edition
        public void sortLexicographicalOrder() {
            Collections.sort(library, new Comparator<T>() {
                @Override
                public int compare(T item1, T item2) {
                    String title1, title2;
                    int edition1, edition2;
                    
                    if (item1 instanceof Book) {
                        Book book1 = (Book) item1;
                        title1 = book1.getTitle();
                        edition1 = book1.getEdition();
                    } else {
                        Multimedia multimedia1 = (Multimedia) item1;
                        title1 = multimedia1.getTitle();
                        edition1 = multimedia1.getEdition();
                    }
                    
                    if (item2 instanceof Book) {
                        Book book2 = (Book) item2;
                        title2 = book2.getTitle();
                        edition2 = book2.getEdition();
                    } else {
                        Multimedia multimedia2 = (Multimedia) item2;
                        title2 = multimedia2.getTitle();
                        edition2 = multimedia2.getEdition();
                    }
                    
                    // First, compare titles lexicographically
                    int titleComparison = title1.compareTo(title2);
                    if (titleComparison != 0) {
                        return titleComparison;
                    }
                    
                    // If titles are equal, compare editions
                    return Integer.compare(edition1, edition2);
                }
                
                // Sort library by reverse lexicographical author, then rating
                public void sortReverseLexicographicalOrder() {
                    Collections.sort(library, new Comparator<T>() {
                        @Override
                        public int compare(T item1, T item2) {
                            String author1, author2;
                            Rating rating1, rating2;
                            
                            if (item1 instanceof Book) {
                                Book book1 = (Book) item1;
                                author1 = book1.getAuthor();
                                rating1 = book1.getRating();
                            } else {
                                Multimedia multimedia1 = (Multimedia) item1;
                                author1 = multimedia1.getAuthor();
                                rating1 = multimedia1.getRating();
                            }
                            
                            if (item2 instanceof Book) {
                                Book book2 = (Book) item2;
                                author2 = book2.getAuthor();
                                rating2 = book2.getRating();
                            } else {
                                Multimedia multimedia2 = (Multimedia) item2;
                                author2 = multimedia2.getAuthor();
                                rating2 = multimedia2.getRating();
                            }
                            
                            // First, compare authors in reverse lexicographical order
                            int authorComparison = author2.compareTo(author1);
                            if (authorComparison != 0) {
                                return authorComparison;
                            }
                            
                            // If authors are equal, compare ratings
                            return rating1.compareTo(rating2);
                        }
                    });
                }
            });
        }
	    
	}
	

	public static void main(String[] args) {
		Book Book1 = new Book("bob", "james", "Crime", 3, 434, 4343, Rating.PG_13);
		System.out.println(Book1.author);
		Multimedia M1 = new Multimedia("bobby", "james", "Crime", "3", 434, 4343, Rating.PG);
		System.out.println(M1.authorPublisher);
		System.out.println(Book1.toString());
		System.out.println(M1.toString());
		
		Library library = new Library();
		library.addItem(Book1);
		library.addItem(M1);
		library.searchLibraryByTitle("bobby");
		library.sortLexicographicalOrder();
	}

}
