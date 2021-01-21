package biblioteka;

import java.util.Date;

/**
 * rezerwacja ksiazki
 */
public class Reservation {
    /**
     * ksiazka ktorej dotyczy rezerwacja
     */
    Book borrowBook;
    /**
     * data zwrotu
     */
    Date dateOfReturns;
    /**
     * Dwuargumentowy konstruktor uruchamiany podczas rezerwacji ksiazki
     * @param bookToBorrow ksiazka ktorej dotyczy rezerwacja
     * @param date data do ktorej nalezy zwrocic ksiazke
     */
    Reservation(Book bookToBorrow, Date date){

        this.borrowBook=bookToBorrow;
        this.borrowBook.setTitle(bookToBorrow.getTitle());
        this.dateOfReturns=date;
    }
    /**
     * zwraca ksiazke ktorej dotyczy rezerwacja
     * @return ksiazka ktorej dotyczy rezerwacja
     */
    public Book getBorrowBook() {
        return borrowBook;
    }
    /**
     * ustawia ksiazke ktorej dotyczy rezerwacja
     * @param borrowBook ksiazka do zarezerwowania
     */
    public void setBorrowBook(Book borrowBook) {
        this.borrowBook = borrowBook;
    }
}
