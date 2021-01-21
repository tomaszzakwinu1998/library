package tests;

import biblioteka.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ReaderTest {

    private Author testAuthor;
    private Book testBook;
    private Book testBook2;
    private Borrowing testBorrowing;
    private Date testDate;
    private Reader testReader;
    @Before
    public void setUp() {
        testAuthor = new Author("Marian", "Kowalski");
        testBook = new Book("Wiedzmin", testAuthor,
                0, BookSection.FANTASY);
        testBook2 = new Book("Wiedzmin", testAuthor,
                0, BookSection.FANTASY);
        testDate= new Date();
        testBorrowing=new Borrowing(testBook, testDate);
        testReader=new Reader("Jan","Kowalski");
    }

    @Test
    public void borrowTheBook() {
        assertNotNull(testBook);
        testReader.borrowTheBook(testBook);
        testReader.borrowTheBook(testBook2);
        assertNotEquals(testReader.listOfLendingBooks.get(0),
                testReader.listOfLendingBooks.get(1));

    }

    @Test
    public void returnTheBook() {
        testReader.borrowTheBook(testBook);
        testReader.borrowTheBook(testBook2);

        assertNotNull(testBorrowing);
        testReader.returnTheBook(testReader.listOfLendingBooks.get(1));
    }


}