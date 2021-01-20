package biblioteka;

public class Book {
    private String title;
    private Author author;
    private int id;
    private boolean availability;
    private BookSection section;


    public Book(String title, Author author, int id, BookSection section){
        this.title=title;
        this.author=author;
        this.id=id;
        this.availability=true;
        this.section=section;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public BookSection getSection() {
        return section;
    }

    public void setSection(BookSection section) {
        this.section = section;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
