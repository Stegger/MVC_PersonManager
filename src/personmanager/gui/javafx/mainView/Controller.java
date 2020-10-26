package personmanager.gui.javafx.mainView;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import personmanager.be.Person;
import personmanager.gui.javafx.model.PersonModel;
import personmanager.gui.javafx.studentView.StudentController;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller {


    public ListView<Person> lstPersons;

    private PersonModel personModel;

    public Controller() {

    }

    public void setPersonModel(PersonModel personModel) {
        this.personModel = personModel;
        lstPersons.setItems(personModel.getPersons());
    }

    public void handleTeacherBtn(ActionEvent actionEvent) {
    }

    public void handleStudentBtn(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/personmanager/gui/javafx/studentView/StudentView.fxml"));
        Parent root = loader.load();
        StudentController studentController = loader.getController();
        studentController.setPersonModel(personModel);

        Stage stage = new Stage();
        stage.setTitle("Student view");
        stage.setScene(new Scene(root));
        stage.show();
    }

}