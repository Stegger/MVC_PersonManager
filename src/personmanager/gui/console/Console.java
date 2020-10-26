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

    public static void main(String[] args)
    {
        Student student = new Student(1, "Peter", "peter@easv365.dk", "DMU");

        student.addGrade(new GradeInfo("SCO", 12));
        student.addGrade(new GradeInfo("SDE", 4));
        student.addGrade(new GradeInfo("ITO", 10));

        System.out.println("Average: " + student.getAverageGrade());


        //MainMenu mainMenu = new MainMenu();
        //mainMenu.run();

    }

}
