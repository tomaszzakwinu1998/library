package biblioteka;

import java.util.Date;

/**
 * wypozyczenie ksiazki
 */
public class Borrowing {

    /**
     * ksiazka ktorej dotyczy wypozyczenie
     */
    Book borrowBook;
    /**
     * data do ktorej nalezy zwrocic ksiazke
     */
    Date dateOfReturns;
    /**
     * Dwuargumentowy konstruktor uruchamiany podczas wypozyczania ksiazki
     * @param bookToBorrow ksiazka ktorej dotyczy wypozyczenie
     * @param date data do ktorej nalezy zwrocic ksiazke
     */
    public Borrowing(Book bookToBorrow, Date date){

        this.borrowBook = bookToBorrow;
        this.borrowBook.setTitle(bookToBorrow.getTitle());
        this.dateOfReturns = date;
    }
    /**
     * zwraca ksiazke ktorej dotyczy wypozyczenie
     * @return ksiazka ktorej dotyczy wypozycznenie
     */
    public Book getBorrowBook() {
        return borrowBook;
    }
    /**
     * ustawia ksiazke ktorej dotyczy wypozyczenie
     * @param borrowBook ksiazka ktorej dotyczy wypozyczenie
     */
    public void setBorrowBook(Book borrowBook) {
        this.borrowBook = borrowBook;
    }
}
