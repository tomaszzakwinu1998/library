package library.ui.addbook;

import biblioteka.listOfBooks;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import biblioteka.Book;
import javafx.scene.control.Alert;

public class BookAddController implements Initializable {

    @FXML
    private JFXTextField title;
    @FXML
    private JFXTextField id;
    @FXML
    private JFXTextField author;
    @FXML

    private JFXButton saveButton;
    @FXML
    private JFXButton cancelButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    biblioteka.listOfBooks lista=new listOfBooks();

    public void addBook(javafx.event.ActionEvent actionEvent) {
        Integer bookId;
        String bookIdString=id.getText();
        bookId=Integer.parseInt(bookIdString);
        String bookAuthor=author.getText();
        String bookTitle=title.getText();

        if(bookId==null||bookAuthor.isEmpty()||bookTitle.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("please enter all fields");
            alert.showAndWait();
            return;
        }

        biblioteka.Book nowa_ksiazka=new Book(bookTitle, bookAuthor, bookId);
        int size_before=lista.listOfBooks.size();
        lista.listOfBooks.add(nowa_ksiazka);

        if(lista.listOfBooks.size()!=size_before){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("success");
            alert.showAndWait();
        }
        else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("failed");
            alert.showAndWait();
        }
        System.out.println(lista.listOfBooks.size());

    }

    public void cancel(ActionEvent actionEvent) {
    }
}