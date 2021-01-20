package biblioteka;

public class Manager extends Person {
    double salary;
    Manager(String name, String surname, double salary){
        super(name, surname);
        this.salary=salary;
    }
    public void addBookToLibrary(ListOfBooks list, Book book ){
        list.addNewBook(book);
    }
}
