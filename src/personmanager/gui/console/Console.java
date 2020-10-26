package personmanager.gui.console;

import personmanager.be.GradeInfo;
import personmanager.be.Person;
import personmanager.be.Student;
import personmanager.be.Teacher;
import personmanager.bll.PersonManager;
import personmanager.gui.javafx.Main;

import java.util.ArrayList;
import java.util.List;

public class Console {

    public static void main(String[] args) {

        PersonManager personManager = new PersonManager();

        personManager.addPerson(new Student(1, "Anders", "a@easv365.dk", "CS"));
        personManager.addPerson(new Student(2, "Buster", "b@easv365.dk", "CS"));
        personManager.addPerson(new Student(3, "Corona Man", "c@easv365.dk", "CS"));

        personManager.addPerson(new Teacher(101, "Peter", "pgn@easv.dk"));
        personManager.addPerson(new Teacher(102, "Jeppe", "jle@easv.dk"));



        MainMenu mainMenu = new MainMenu(personManager);
        mainMenu.run();

    }

}
