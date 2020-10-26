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
        MainMenu mainMenu = new MainMenu(personManager);
        mainMenu.run();

    }

}
