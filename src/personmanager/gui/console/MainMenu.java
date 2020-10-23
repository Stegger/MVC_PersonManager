package personmanager.gui.console;

public class MainMenu extends Menu {

    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     *
     * @param header    The header text of the menu.
     * @param menuItems The list of menu items texts.
     */
    public MainMenu() {
        super("Main menu", "Students Menu", "Teachers Menu");
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

    }
}
