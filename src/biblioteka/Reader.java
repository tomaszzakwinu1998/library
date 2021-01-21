package biblioteka;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Reader extends Person {
    public ArrayList<Borrowing> listOfLendingBooks = new ArrayList<Borrowing>();
    public ArrayList<Borrowing> listOfReservations = new ArrayList<Borrowing>();

    public Reader(String name, String surname){
        super(name, surname);
    }

    /**
     * funkcja pozwalająca czytelnikowi wypożyczyć książkę
     * @param borrowBook książka, którą chce wypożyczyć czytelnik
     * @return czy książka została wypożyczona
     */
    public boolean borrowTheBook(Book borrowBook){
        /**
         * czy podana książka jest dostępna w bibliotece
         */
        if(borrowBook.isAvailable()==true) {
            /**
             * dokładna data kiedy czytelnik wypożycza książkę
             */
            Date dt = new Date();
            /**
             * dodaje do aktualnej daty 14 dni aby określić data zwrotu książki
             */
            Calendar c = Calendar.getInstance();
            c.setTime(dt);
            c.add(Calendar.DATE, 14);
            dt = c.getTime();
            Borrowing newBookToBorrow=new Borrowing(borrowBook, dt);
            /**
             * dodaje wypożyczenie do wypożyczeń czytelnika
             */
            listOfLendingBooks.add(newBookToBorrow);
            /**
             * zmniejsza ilość dostępnych egzemplarzy wypożyczonej książki
             */
            borrowBook.quantityOfSpecifyBook--;
            /**
             * jeśli ilość ezgempplarzy ksiazki to zero, ksiązka nie jest dostepna
             */
            if(borrowBook.getQuantityOfSpecifyBook()==0)
                borrowBook.setAvailability(false);
            System.out.println("You succesfully borrow the book! You have to return it before: "  + dt);
            /**
             * czy ksiazka wypozyczona
             */
            return true;
        }
        System.out.println("This book is not available");
        /**
         * czy ksiazka wypozyczona
         */
        return false;
    }
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
        //da się ale jak wykonać dwie rzeczy nie w tym samym momencie
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

