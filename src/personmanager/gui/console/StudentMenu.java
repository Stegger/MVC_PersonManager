package personmanager.gui.console;

import personmanager.be.Student;
import personmanager.bll.PersonManager;

public class StudentMenu extends Menu {

    private PersonManager personManager;

    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     *
     * @param header    The header text of the menu.
     * @param menuItems The list of menu items texts.
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
    protected void doAction(int option)
    {
        switch (option)
        {
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
        for(Student student : personManager.getAllStudents())
        {
            System.out.println(student);
        }
        pause();
    }

    private void addStudent()
    {

    }

}
