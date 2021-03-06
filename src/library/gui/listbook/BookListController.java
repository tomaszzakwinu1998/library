package library.gui.listbook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class BookListController implements Initializable {


    @FXML
    private AnchorPane rootPane;

    @FXML
    private TableView tableView;

    @FXML
    private TableColumn author;

    @FXML
    private TableColumn title;
    @FXML
    private TableColumn avail;




    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void initCol(){
        //title.setCellFactory(new PropertyValueFactory<>());
    }






    public void cancel(ActionEvent actionEvent) {
        Stage stage = (Stage) rootPane.getScene().getWindow();
        stage.close();
    }
}
