package library.gui.addbook;

import biblioteka.BookSection;
import biblioteka.ListOfBooks;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import biblioteka.Book;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BookAddController implements Initializable {

    @FXML
    private JFXTextField title;
    @FXML
    private JFXTextField id;
    @FXML
    private JFXTextField author;
    @FXML
    private AnchorPane rootPane;

    private JFXButton saveButton;
    @FXML
    private JFXButton cancelButton;

    public ListOfBooks lista=new ListOfBooks();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public ListOfBooks getList(){
        return lista;
    }

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

        biblioteka.Book nowa_ksiazka=new Book(bookTitle, bookAuthor, bookId, BookSection.FANTASY);
        int size_before=lista.listOfBooks.size();
        lista.addNewBook(nowa_ksiazka);

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
        System.out.println(lista.listOfBooks.get(0).getTitle());

    }

    public void cancel(ActionEvent actionEvent) {
        Stage stage = (Stage) rootPane.getScene().getWindow();
        stage.close();
    }
}
