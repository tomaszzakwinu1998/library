package tests;

import biblioteka.Author;
import biblioteka.Book;
import biblioteka.BookSection;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;


public class AuthorTest {

    private Author testAuthor;
    private Book testBook;
    @Before
    public void setUp(){
        testAuthor=new Author("Marian", "Kowalski");
        testBook=new Book("Wiedzmin", testAuthor, 0, BookSection.FANTASY);

    }
    @Test
    public void testAddBookToAuthorBooks() {

        ArrayList<Book> testArray = new ArrayList<Book>();
        testArray.add(testBook);
        assertNotNull(testArray);
        assertEquals(testArray.size(),1);//
    }

    @Test
    public void showBooksOfSpecifyAuthor() {
    }

    @Test
    public void equals() {
    }
}