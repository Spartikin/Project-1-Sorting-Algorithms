import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class mainTest {

    @Test
    public void testConstructor() {
        main.Book book = new main.Book("title", "author", "genre", 200, 2021, 1, main.Rating.PG);

        assertEquals("title", book.getTitle());
        assertEquals("author", book.getAuthor());
        assertEquals(1, book.getEdition());
        assertEquals(main.Rating.PG, book.getRating());
    }

    @Test
    public void testToString() {
    	main.Book book = new main.Book("title", "author", "genre", 200, 2021, 1, main.Rating.PG);
        assertEquals("title by author (Edition: 1)", book.toString());
    }

    @Test
    public void testHashCode() {
    	main.Book book1 = new main.Book("title", "author", "genre", 200, 2021, 1, main.Rating.PG);
    	main.Book book2 = new main.Book("title", "author", "genre", 200, 2021, 1, main.Rating.PG);

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void testEquals() {
    	main.Book book1 = new main.Book("title", "author", "genre", 200, 2021, 1, main.Rating.PG);
    	main.Book book2 = new main.Book("title", "author", "genre", 200, 2021, 1, main.Rating.PG);
    	main.Book book3 = new main.Book("title", "author", "genre", 200, 2021, 2, main.Rating.PG);
    	main.Book book4 = new main.Book("title", "author", "genre", 300, 2021, 1, main.Rating.PG);

        assertTrue(book1.equals(book2));
        assertFalse(book1.equals(book3));
        assertTrue(book1.equals(book4));
    }

    @Test
    public void testGetTitle() {
    	main.Book book = new main.Book("title", "author", "genre", 200, 2021, 1, main.Rating.PG);
        assertEquals("title", book.getTitle());
    }

    @Test
    public void testGetEdition() {
    	main.Book book = new main.Book("title", "author", "genre", 200, 2021, 1, main.Rating.PG);
        assertEquals(1, book.getEdition());
    }

    @Test
    public void testGetAuthor() {
    	main.Book book = new main.Book("title", "author", "genre", 200, 2021, 1, main.Rating.PG);
        assertEquals("author", book.getAuthor());
    }

    @Test
    public void testGetRating() {
    	main.Book book = new main.Book("title", "author", "genre", 200, 2021, 1, main.Rating.PG);
        assertEquals(main.Rating.PG, book.getRating());
    }

}
