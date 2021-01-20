package biblioteka;

/**
 * Klasa reprezntująca dowolnego klienta systemu, będzie rozszerzana poprzez inne klasy
 */
public class Person {
    /**
     * Imie danego klienta systemu
     */
    String name;
    /**
     * Nazwisko danego klienta systemu
     */
    String surname;


    /**
     * Konstruktor dwuargumentowy tworzący obiekt klasy @Person
     * @param name Imię podawnane przy tworzeniu nowego konta klienta systemu
     * @param surname Nazwisko podawnane przy tworzeniu nowego konta klienta systemu
     */
    Person(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
}
