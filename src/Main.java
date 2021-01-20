import biblioteka.Author;
import biblioteka.Book;
import biblioteka.BookSection;
import biblioteka.ListOfBooks;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("library.gui/addbook/bookadd.fxml"));
        primaryStage.setTitle("Adding book to library");
        primaryStage.setScene(new Scene(root, 338, 464));
        primaryStage.show();
    }


    public static void main(String[] args) {

        ListOfBooks list=new ListOfBooks();
        Author JanKowalski=new Author("Jan", "Kowalski");


        Book encyklopedia=new Book("Encyklopedia", JanKowalski, 0, BookSection.HISTORICAL);
        //Book wiedzmin=new Book("Wiedzmin", "Andrzej Sapkowski", 1, BookSection.FANTASY);
        //Book wPustyniiwPuszczy=new Book("W postaci i w puszczy", "Henryk Sienkiewicz",2, BookSection.SCIENCE_FICTION);

        list.addNewBook(encyklopedia);
        //list.addNewBook(wiedzmin);
        //list.addNewBook(wPustyniiwPuszczy);

        JanKowalski.showBooksOfSpecifyAuthor();

        //list.showBooksInSection(BookSection.HISTORICAL);//pokaż książki w dziale
        //list.showBooksInLibrary();//pokaz wszystkie ksiazki
        //launch(args);

    }
}
