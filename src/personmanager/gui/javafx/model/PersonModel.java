package personmanager.gui.javafx.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import personmanager.be.Person;
import personmanager.be.Student;
import personmanager.bll.PersonManager;

public class PersonModel {

    private ObservableList<Person> persons;
    private ObservableList<Student> students;

    private PersonManager personManager;

    public PersonModel()
    {
        persons = FXCollections.observableArrayList();
        students = FXCollections.observableArrayList();

        personManager = new PersonManager();

        persons.addAll(personManager.getAllPersons());
        students.addAll(personManager.getAllStudents());

    }

    public ObservableList<Person> getPersons() {
        return persons;
    }

    public void addPerson(Person person)
    {
        personManager.addPerson(person);

        persons.clear();
        students.clear();

        persons.addAll(personManager.getAllPersons());
        students.addAll(personManager.getAllStudents());
    }


    public ObservableList<Student> getStudents()
    {
        return students;
    }
}
