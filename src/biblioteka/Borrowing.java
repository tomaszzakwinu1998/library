package biblioteka;

import java.util.Date;

public class Borrowing {


    Book borrowBook;
    Date dateOfReturns;
    Borrowing(Book bookToBorrow, Date date){

        this.borrowBook=bookToBorrow;
        this.borrowBook.setTitle(bookToBorrow.getTitle());
        this.dateOfReturns=date;
    }
    public Book getBorrowBook() {
        return borrowBook;
    }

    public void setBorrowBook(Book borrowBook) {
        this.borrowBook = borrowBook;
    }
}
