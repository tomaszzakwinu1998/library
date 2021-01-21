package biblioteka;

import java.util.ArrayList;

/**
 * Klasa reprezntująca autora książek
 */
public class Author extends Person {

    /**
     * Lista książek napisanych przez autora
     */
    public ArrayList<Book> listOfBooksOfSpecifyAuthor = new ArrayList<Book>();
    /**
     * Konstruktor dwuargumentowy tworzący obiekt klasy @Author
     * @param name Imię podawnane przy tworzeniu nowego autora
     * @param surname Nazwisko podawnane przy tworzeniu nowego autora
     */
    public Author(String name, String surname){
        super(name, surname);

        /**
         * Dodawanie książki do listy książek autora
         * @param book książka do dodania do listy książek autora
         */
    }
    public void addBookToTheListOfSpecifyAuthor(Book book){
        listOfBooksOfSpecifyAuthor.add(book);
    }

    /**
     * Wyświetlanie książek napisanych przez autora
     */
    public void showBooksOfSpecifyAuthor(){
        for(int i=0; i<listOfBooksOfSpecifyAuthor.size(); i++) {
            System.out.println(this.name+""+this.surname);
            System.out.println(listOfBooksOfSpecifyAuthor.get(i).getTitle());
        }
    }

    /**
     * Przeciążona metoda equals porównująca imię oraz nazwisko
     * @param o obiekt klasy Author który zostanie porównany
     * @return wartość boolean określająca czy autorzy mają takie same imiona oraz nazwiska
     */
    public boolean equals(Object o) {
        Author other = (Author) o; //CASTING
        if (this.name.equals(other.name)
                &&this.surname.equals(other.surname))
        return true;
    else
        return false;
    }
    public ArrayList<Book> getListOfBooksOfSpecifyAuthor() {
        return listOfBooksOfSpecifyAuthor;
    }
}
