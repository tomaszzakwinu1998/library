package biblioteka;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int id;
    private boolean availability;
    private bookSection section;


    public Book(String title, String author, int id){
        this.title=title;
        this.author=author;
        this.id=id;
        this.availability=true;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }
}
