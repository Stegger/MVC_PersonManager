package personmanager.gui.console;

import personmanager.be.Student;
import personmanager.bll.PersonManager;

import java.util.Random;
import java.util.Scanner;

public class StudentMenu extends Menu {


    private PersonManager personManager;

    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     */
    public StudentMenu(PersonManager personManager) {
        super("Student Menu", "Add student", "See all students");
        this.personManager = personManager;
    }

    /**
     * Abstract method stating what should be done, when a
     * menu option is selected.
     * The method must be overridden by the sub-class.
     *
     * @param option the menu option that has been selected.
     */
    @Override
    protected void doAction(int option) {
        switch (option) {
            case 1:
                addStudent();
                break;
            case 2:
                seeAllStudents();
                break;
        }
    }

    private void seeAllStudents() {
        System.out.println("All students:");
        for (Student student : personManager.getAllStudents()) {
            System.out.println(student);
        }
        pause();
    }

    private void addStudent() {
        System.out.print("Type student name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.print("Type student email:");
        String email = scanner.nextLine();

        System.out.print("Type student education:");
        String education = scanner.nextLine();

        System.out.print("Type student ID:");
        int ID = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(ID, name, email, education);

        personManager.addPerson(student);
    }

}
