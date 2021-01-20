package biblioteka;

import java.util.ArrayList;

public class ListOfBooks {
    public ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public void addNewBook(Book newBook) {
        if (isTheBookInTheLibrary(newBook) == false)
            listOfBooks.add(newBook);
    }

    public boolean isTheBookInTheLibrary(Book book) {
        boolean help = false;//ksiązki nie ma

        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getTitle().equals(book.getTitle())) {
                System.out.println("Ta książka jest już w bibliotece");
                help = true;
            }
        }
        return help;


    }
    public void showBooksInLibrary() {
        for (int i = 0; i < listOfBooks.size(); i++) {
            System.out.println("Title: " + listOfBooks.get(i).getTitle() + "      Author: " + listOfBooks.get(i).getAuthor());

        }
    }

    public void showBooksInSection(BookSection section) {
        for (int i = 0; i < listOfBooks.size(); i++) {

            if (listOfBooks.get(i).getSection() == section) {
                System.out.println("Title: " + listOfBooks.get(i).getTitle() + "      Author: " + listOfBooks.get(i).getAuthor());
            }
        }
    }
}
