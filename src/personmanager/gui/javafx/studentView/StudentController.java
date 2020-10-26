package personmanager.gui.javafx.studentView;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import personmanager.be.Student;
import personmanager.gui.javafx.model.PersonModel;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentController {

    public ListView<Student> lstStudent;
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtEducation;
    public TextField txtId;

    private PersonModel personModel;


    public void handleAddStudent(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtId.getText().trim());
        String name = txtName.getText();
        String email = txtEmail.getText();
        String education = txtEducation.getText();
        Student student = new Student(id, name, email, education);
        personModel.addPerson(student);
    }

    public void setPersonModel(PersonModel personModel)
    {
        this.personModel = personModel;
        lstStudent.setItems(personModel.getStudents());
    }
}