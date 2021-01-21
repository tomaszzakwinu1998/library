package biblioteka;

/**
 * Klasa reprezentująca książkę
 */
public class Book {
    /**
     * tytuł książki
     */
    private String title;
    /**
     * autor ksiazki
     */
    private Author author;
    /**
     * identyfikator ksiazki
     */
    private int id;
    /**
     * dostepnosc do wypozyczenia ksiazki
     */
    private boolean availability;
    /**
     * sekcja do ktorej nalezy ksiazka
     */
    private BookSection section;

    /**
     * zwraca ilosc  egzemplarzy ksiazki
     * @return ilosc  egzemplarzy ksiazki
     */
    public int getQuantityOfSpecifyBook() {
        return quantityOfSpecifyBook;
    }

    /**
     * ustawia ilosc egzemplarzy ksiazki
     * @param quantityOfSpecifyBook ilosc egzemplarzy ksizaki
     * @return ilosc  egzemplarzy ksiazki
     */
    public void setQuantityOfSpecifyBook(int quantityOfSpecifyBook) {
        this.quantityOfSpecifyBook = quantityOfSpecifyBook;
    }

    /**
     * ilosc egzemplarzy ksiazki
     */
    public int quantityOfSpecifyBook=0;

    /**
     * Konstruktor czteroargumentowy tworzący obiekt klasy @Book
     * @param title tytul ksiazki podawany podczas dodawania ksiazki
     * @param author autor podawany podczas dodawania ksiazki
     * @param id identyfikator podawany podczas dodawania ksiazki
     * @param section sekcja podawana podczas dodawania ksiazki
     */
    public Book(String title, Author author, int id, BookSection section){
        this.title = title;
        this.author = author;
        this.id = id;
        this.availability = true;
        this.section = section;

    }
    /**
     * Funkcja zwraca tytul ksiazki
     * @return tytul ksiazki
     */
    public String getTitle() {
        return title;
    }
    /**
     * ustawia tytul
     * @param title tytul ksiazki
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * zwraca autora
     * @return autor
     */
    public Author getAuthor() {
        return author;
    }
    /**
     * ustawia autora
     * @param autor
     */
    public void setAuthor(Author author) {
        this.author.name = author.name;
        this.author.surname = author.surname;
    }
    /**
     * zwraca identyfikator
     * @return identyfikator
     */
    public int getID() {
        return id;
    }
    /**
     * ustawia identyfikator
     * @param id identyfikator
     */
    public void setID(int id) {
        this.id = id;
    }
    /**
     * zwraca sekcje ksiazki
     * @return sekcja
     */
    public BookSection getSection() {
        return section;
    }
    /**
     * ustawia sekcje
     * @param section sekcja
     */
    public void setSection(BookSection section) {
        this.section = section;
    }
    /**
     * zwraca informacje czy ksiazka jest dostepna
     * @return zmienna boolean wskazujaca czy książka jest dostępna czy nie
     */
    public boolean isAvailable() {
        if(this.availability == true)
            return true;
        else
            return false;
    }
    /**
     * ustawienie dostepnosci
     * @param availability nowa dostepnosc
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
