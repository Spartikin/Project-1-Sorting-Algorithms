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
    
    @Test
    public void testMConstructor() {
        main.Multimedia multimedia = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 1, main.Rating.PG);

        assertEquals("title", multimedia.getTitle());
        assertEquals("authorPublisher", multimedia.getAuthor());
        assertEquals(1, multimedia.getEdition());
        assertEquals(main.Rating.PG, multimedia.getRating());
    }

    @Test
    public void testMToString() {
        main.Multimedia multimedia = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 1, main.Rating.PG);
        assertEquals("title by authorPublisher (Edition: 1)", multimedia.toString());
    }

    @Test
    public void testMHashCode() {
        main.Multimedia multimedia1 = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 1, main.Rating.PG);
        main.Multimedia multimedia2 = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 1, main.Rating.PG);

        assertEquals(multimedia1.hashCode(), multimedia2.hashCode());
    }

    @Test
    public void testMEquals() {
        main.Multimedia multimedia1 = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 1, main.Rating.PG);
        main.Multimedia multimedia2 = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 1, main.Rating.PG);
        main.Multimedia multimedia3 = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 2, main.Rating.PG);
        main.Multimedia multimedia4 = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2022, 1, main.Rating.PG);

        assertTrue(multimedia1.equals(multimedia2));
        assertFalse(multimedia1.equals(multimedia3));
        assertTrue(multimedia1.equals(multimedia4));
    }

    @Test
    public void testMGetTitle() {
        main.Multimedia multimedia = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 1, main.Rating.PG);
        assertEquals("title", multimedia.getTitle());
    }

    @Test
    public void testMGetEdition() {
        main.Multimedia multimedia = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 1, main.Rating.PG);
        assertEquals(1, multimedia.getEdition());
    }

    @Test
    public void testMGetAuthor() {
        main.Multimedia multimedia = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 1, main.Rating.PG);
        assertEquals("authorPublisher", multimedia.getAuthor());
    }

    @Test
    public void testMGetRating() {
        main.Multimedia multimedia = new main.Multimedia("title", "authorPublisher", "type", "lengthDuration", 2021, 1, main.Rating.PG);
        assertEquals(main.Rating.PG, multimedia.getRating());
    }

}
