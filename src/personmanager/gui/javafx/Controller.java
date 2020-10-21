package personmanager.gui.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable
{


    public TextField txtInput;
    public ListView lstPersons;

    private PersonModel personModel;

    public Controller()
    {
        personModel = new PersonModel();
    }



    public void handleAddPerson(ActionEvent actionEvent)
    {
        String input = txtInput.getText();
        personModel.addPerson(input);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lstPersons.setItems(personModel.getPersons());
    }
}