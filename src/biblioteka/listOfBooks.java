package biblioteka;

import java.util.ArrayList;

public class listOfBooks {
    public ArrayList<Book> listOfBooks =new ArrayList<Book>();
    public void addNewBook(Book newBook){
        if(isTheBookInTheLibrary(newBook)==false)
            listOfBooks.add(newBook);
    }
    public boolean isTheBookInTheLibrary(Book book){
        boolean help=false;//ksiązki nie ma

        for(int i = 0; i< listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getTitle().equals(book.getTitle())) {
                System.out.println("Ta książka jest już w bibliotece");
                help=true;
            }
        }
        return help;


    }
}
