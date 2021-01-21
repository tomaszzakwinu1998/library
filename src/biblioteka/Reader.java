package biblioteka;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 * Klasa reprezentująca czytelnika
 */
public class Reader extends Person {

    /**
     * lista wypozyczonych ksiazek
     */
    public ArrayList<Borrowing> listOfLendingBooks = new ArrayList<Borrowing>();

    /**
     * Lista zarezerwowanych ksiazek
     */
    public ArrayList<Borrowing> listOfReservations = new ArrayList<Borrowing>();


    /**
     * dwuargumentowy konstruktor tworzacy nowego czytelnika
     * @param name imie
     * @param surname nazwisko
     */
    public Reader(String name, String surname){
        super(name, surname);
    }


    /**
     * funkcja umozliwiajaca wypozyczenie ksiazki
     * @param borrowBook ksiazka do wypozyczenia
     */
    public boolean borrowTheBook(Book borrowBook){
        if(borrowBook.isAvailable()==true) {
            Date dt = new Date();

            Calendar c = Calendar.getInstance();
            c.setTime(dt);
            c.add(Calendar.DATE, 14);
            dt = c.getTime();
            Borrowing newBookToBorrow=new Borrowing(borrowBook, dt);
            listOfLendingBooks.add(newBookToBorrow);
            borrowBook.quantityOfSpecifyBook--;
            if(borrowBook.getQuantityOfSpecifyBook()==0)
                borrowBook.setAvailability(false);
            System.out.println("You succesfully borrow the book! You have to return it before: "  + dt);
            return true;
        }
        System.out.println("This book is not available");
        return false;
    }

    /**
     * funkcja umożliwiająca oddanie książki
     * @param borrowing wypozyczenie
     * @return zwraca true jesli poprawnie zwrocono ksiazke
     */
    public boolean returnTheBook(Borrowing borrowing){

            if (borrowing != null) {
                borrowing.borrowBook.quantityOfSpecifyBook++;
                if (borrowing.borrowBook.getQuantityOfSpecifyBook() == 0)
                    borrowing.borrowBook.setAvailability(true);
        /*int index;
        for(int i=0; i<listOfLendingBooks.size(); i++){
            if(borrowing.borrowBook.equals(listOfLendingBooks.get(i))){
                index=i;
            }
        }*/
        //da się ale jak wykonać dwie rzeczy nie w tym samym momencie xDDDD
                /*
                Date dt = new Date();
                if(borrowing.dateOfReturns.after(dt)==true);
                    System.out.println("Ups! You are late! You owe the library $294.68 in late fees");*/
                listOfLendingBooks.remove(borrowing);
                System.out.println("You return the book successfully");
                return true;
            } else
                return false;
    }

    /**
     * funkcja umozliwiajaca rezerwacje książki
     * @param book ksiazka do zarezerwowania
     * @return zwraca boolean okreslajacy czy ksiazke poprawnie zarezerwowano
     */
    public boolean reserveTheBook(Book book){
        if(book.isAvailable()==true) {
            Date dt = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(dt);
            c.add(Calendar.DATE, 1);
            dt = c.getTime();
            Borrowing newBookToBorrow=new Borrowing(book, dt);
            listOfReservations.add(newBookToBorrow);
            book.quantityOfSpecifyBook--;
            if(book.getQuantityOfSpecifyBook()==0)
                book.setAvailability(false);
            System.out.println("You succesfully reserve the book! You have to borrow it before: "  + dt);
            return true;
        }
        System.out.println("This book is not available");
        return false;
    }



}

