package personmanager.gui.console;

import personmanager.bll.PersonManager;

public class MainMenu extends Menu {

    private PersonManager personManager;

    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     *
     */
    public MainMenu(PersonManager personManager) {
        super("Main menu", "Students Menu", "Teachers Menu");
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
        switch (option)
        {
            case 1:
                showStudentsMenu();
                break;

        }
    }

    private void showStudentsMenu()
    {
        StudentMenu studentMenu = new StudentMenu(personManager);
        studentMenu.run();
    }
}
