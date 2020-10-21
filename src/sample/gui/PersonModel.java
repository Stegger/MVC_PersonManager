package sample.gui;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class PersonModel {

    private ObservableList<String> persons;

    public PersonModel()
    {
        persons = FXCollections.observableArrayList();
    }

    public ObservableList<String> getPersons() {
        return persons;
    }

    public void addPerson(String name)
    {
        persons.add(name);
    }


}
