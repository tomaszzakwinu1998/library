import biblioteka.Book;
import biblioteka.ListOfBooks;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("bookadd.fxml"));
        primaryStage.setTitle("Adding book to library");
        primaryStage.setScene(new Scene(root, 338, 464));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Book encyklopedia=new Book("Encyklopedia", "Jan Kowalski", 0);
        Book wiedzmin=new Book("Wiedzmin", "Andrzej Sapkowski", 1);
        Book wPustyniiwPuszczy=new Book("W postaci i w puszczy", "Henryk Sienkiewicz",2);

        ListOfBooks list=new ListOfBooks();
        list.addNewBook(encyklopedia);
        list.addNewBook(wiedzmin);
        list.addNewBook(wPustyniiwPuszczy);
        //launch(args);

    }
}
