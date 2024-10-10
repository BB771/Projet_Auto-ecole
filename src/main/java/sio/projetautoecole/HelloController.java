package sio.projetautoecole;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private AnchorPane accueil;
    @FXML
    private AnchorPane responsables;
    @FXML
    private AnchorPane moniteurs;
    @FXML
    private AnchorPane eleves;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void onHelloButtonClick(ActionEvent actionEvent) {
    }
}