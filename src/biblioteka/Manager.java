package biblioteka;

/**
 * osoba zarzadzajaca biblioteka
 */
public class Manager extends Person {
    /**
     * pensja
     */
    double salary;
    /**
     * trójargumentowy konstruktor uruchamiany podczas dodawania nowego managera
     * @param name imie managera
     * @param surname nazwisko managera
     * @param salary pensja managera
     */
    Manager(String name, String surname, double salary){
        super(name, surname);
        this.salary=salary;
    }

    /**
     * funkcja dodajaca ksiazke do biblioteki
     * @param list lista ksiazek w bibliotece
     * @param book ksiazka do dodania do biblioteki
     */
    public void addBookToLibrary(ListOfBooks list, Book book ){
        list.addNewBook(book);
    }
}
