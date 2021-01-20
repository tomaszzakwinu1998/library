package biblioteka;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Reader extends Person {
    public ArrayList<Borrowing> listOfLendingBooks = new ArrayList<Borrowing>();

    public Reader(String name, String surname){
        super(name, surname);
    }

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
                listOfLendingBooks.remove(borrowing);
                System.out.println("You return the book successfully");
                return true;
            } else
                return false;
    }



}

