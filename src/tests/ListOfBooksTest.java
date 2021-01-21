package tests;

import biblioteka.Author;
import biblioteka.Book;
import biblioteka.BookSection;
import biblioteka.ListOfBooks;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListOfBooksTest {
    private Author testAuthor;
    private Book testBook;
    private Book testBook2;

    private ListOfBooks testList;

    @Before
    public void setUp(){
        testAuthor=new Author("Marian", "Kowalski");
        testBook=new Book("Wiedzmin", testAuthor, 0, BookSection.FANTASY);
        testBook2=new Book("Wiedzmin", testAuthor, 0, BookSection.FANTASY);

        testList=new ListOfBooks();
    }

    @Test
    public void addNewBook() {

        testList.listOfBooks.add(testBook);
        assertNotNull(testList.isTheBookInTheLibrary(testBook));
        assertEquals(testBook.quantityOfSpecifyBook,1);
    }

    @Test
    public void isTheBookInTheLibrary() {
        testList.listOfBooks.add(testBook);
        testList.listOfBooks.add(testBook2);
        assertEquals(testList.listOfBooks.get(0).getTitle(),testList.listOfBooks.get(1).getTitle());
        assertNotSame(testList.listOfBooks.get(0),testList.listOfBooks.get(1));


    }

    @Test
    public void showBooksInLibrary() {
        testList.listOfBooks.add(testBook);
        testList.listOfBooks.add(testBook2);
        assertNotNull(testList.listOfBooks);
    }

    @Test
    public void showBooksInSection() {
        testList.listOfBooks.add(testBook);
        testList.listOfBooks.add(testBook2);
        assertNotNull(testBook.getSection());
        assertEquals(testBook.getSection(),testBook2.getSection());
    }
}