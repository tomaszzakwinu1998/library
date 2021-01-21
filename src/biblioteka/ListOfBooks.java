package biblioteka;

import java.util.ArrayList;


/**
 * Klasa reprezentująca listę książek w bibliotece
 */
public class ListOfBooks {

    /**
     * lista ksiazek w bibliotece
     */
    public ArrayList<Book> listOfBooks = new ArrayList<Book>();


    /**
     * dodanie ksiazki do biblioteki
     * @param newBook ksiazka do dodania
     */
    public void addNewBook(Book newBook) {
        if (isTheBookInTheLibrary(newBook) == false) {
            listOfBooks.add(newBook);
            newBook.quantityOfSpecifyBook++;
            newBook.getAuthor().addBookToTheListOfSpecifyAuthor(newBook);
        }
    }


    /**
     * sprawdzenie czy ksiazka jest juz w bibliotece
     * @param book ksiazka do sprawdzenie czy jest w bibliotece
     * @return wynik sprawdzenia czy ksiazka jest juz w bibliotece
     */
    public boolean isTheBookInTheLibrary(Book book) {
        boolean help = false;//ksiązki nie ma

        for (int i = 0; i < listOfBooks.size(); i++) {
            if (listOfBooks.get(i).getTitle().equals(book.getTitle())) {
                System.out.println("This book is already in the library");
                listOfBooks.get(i).quantityOfSpecifyBook++;
                help = true;
            }
        }
        return help;


    }

    /**
     * wyswietlenie listy ksiazek w bibliotece
     */
    public void showBooksInLibrary() {
        for (int i = 0; i < listOfBooks.size(); i++) {
            System.out.println("Title: " + listOfBooks.get(i).getTitle() +
                    "      Author: " + listOfBooks.get(i).getAuthor().name+
                    " "+listOfBooks.get(i).getAuthor().surname);

        }
    }

    /**
     * wyswietlenie wszystkich ksiazek z danej sekcji
     * @param section nazwa sekcji
     */
    public void showBooksInSection(BookSection section) {
        for (int i = 0; i < listOfBooks.size(); i++) {

            if (listOfBooks.get(i).getSection() == section) {
                System.out.println("Title: " + listOfBooks.get(i).getTitle()
                        + "      Author: " + listOfBooks.get(i).getAuthor());
            }
        }
    }
}
