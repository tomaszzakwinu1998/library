import biblioteka.*;
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
        Book encyklopedia1=new Book("Encyklopedia", JanKowalski, 0, BookSection.HISTORICAL);

        //Book wiedzmin=new Book("Wiedzmin", "Andrzej Sapkowski", 1, BookSection.FANTASY);
        //Book wPustyniiwPuszczy=new Book("W postaci i w puszczy", "Henryk Sienkiewicz",2, BookSection.SCIENCE_FICTION);

        list.addNewBook(encyklopedia);
        list.addNewBook(encyklopedia1);

        System.out.println(encyklopedia.quantityOfSpecifyBook);
        //list.addNewBook(wiedzmin);
        //list.addNewBook(wPustyniiwPuszczy);

        //JanKowalski.showBooksOfSpecifyAuthor();

        //list.showBooksInSection(BookSection.HISTORICAL);//pokaż książki w dziale
        list.showBooksInLibrary();//pokaz wszystkie ksiazki

        Reader michalTom=new Reader("Michal","Tomaszewski");
        michalTom.borrowTheBook(encyklopedia);
        michalTom.borrowTheBook(encyklopedia);
        //System.out.println(michalTom.listOfLendingBooks.get(0).getBorrowBook().getTitle());
        //System.out.println(encyklopedia.isAvailable());
        System.out.println(encyklopedia.isAvailable());
        //michalTom.borrowTheBook(encyklopedia);
        michalTom.borrowTheBook(encyklopedia);
        michalTom.borrowTheBook(encyklopedia);


        michalTom.returnTheBook(michalTom.listOfLendingBooks.get(0));
        michalTom.returnTheBook(michalTom.listOfLendingBooks.get(0));

        try {
            michalTom.returnTheBook(michalTom.listOfLendingBooks.get(0));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("YOU DONT HAVE ANY BOOKS :) EVERYTHING IS OK :)" );
        }
        //launch(args);

    }
}
