package biblioteka;

import java.util.ArrayList;

public class Author extends Person {
    public ArrayList<Book> listOfBooksOfSpecifyAuthor = new ArrayList<Book>();

    public Author(String name, String surname){
        super(name, surname);


    }
    public void addBookToTheListOfSpecifyAuthor(Book book){
        listOfBooksOfSpecifyAuthor.add(book);
    }


    public void showBooksOfSpecifyAuthor(){
        for(int i=0; i<listOfBooksOfSpecifyAuthor.size(); i++) {
            System.out.println(this.name+""+this.surname);
            System.out.println(listOfBooksOfSpecifyAuthor.get(i).getTitle());
        }
    }
    //przeciążona metoda equals
    public boolean equals(Object o) {
        Author other = (Author) o; //CASTING
        if (this.name.equals(other.name)&&this.surname.equals(other.surname))
        return true;
    else
        return false;
    }
}
