package personmanager.gui.console;

import java.util.Scanner;

/**
 * Abstract class implementing the basic functionality of a console based
 * menu class. A menu can be created by sub-classing this class and implement
 * the abstract method doAction(option).
 * <p>
 * The constructor of the sub-class must invoke the super-class constructor by
 * the instruction
 * <p>
 * super(“some header”, “menuoption1", "menuoption2");
 * <p>
 * Note, that this instruction must be the first instruction of the sub-class
 * constructor.
 *
 * @author bhp
 */
public abstract class Menu {

    // value used to exit the menu.
    // the value can be changed by the sub-class constructor.
    protected int EXIT_OPTION = 0;

    // The menu header text
    private String header;

    // The list of menu options texts.
    private String[] menuItems;
    private String inputText = "Please choose your menu option:";

    protected Scanner scanner;

    /**
     * Abstract method stating what should be done, when a
     * menu option is selected.
     * The method must be overridden by the sub-class.
     *
     * @param option the menu option that has been selected.
     */
    protected abstract void doAction(int option);


    /**
     * Creates an instance of the class with the given header text and
     * menu options.
     *
     * @param header    The header text of the menu.
     * @param menuItems The list of menu items texts.
     */
    public Menu(String header, String... menuItems) {
        this.header = header;
        this.menuItems = menuItems;
        scanner = new Scanner(System.in);
    }

    /**
     * Executes the menu until the EXIT_OPTION has been selected.
     * This is an implementation of the Template Method design pattern.
     */
    public void run() {
        boolean done = false;
        while (!done) {
            showMenu();
            int option = getOption();

            if (option == EXIT_OPTION) {
                done = true;
            } else {
                doAction(option);
            }
        }
    }

    /**
     * Returns a valid menu-option input from the keyboard.
     * The method continues prompting for an option value, until
     * a valid option has been input.
     *
     * @return A valid menu option.
     */
    private int getOption() {
        System.out.println();
        int nr = -1;
        while (nr < 0) {
            System.out.print(inputText);
            String nrAsString = scanner.nextLine();
            try {
                nr = Integer.parseInt(nrAsString.trim());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input, did you type a number?");
            }
            if (nr > menuItems.length) //If number is out of range, we change it to negative one
            {
                System.out.println("Please choose an option in range (0-" + menuItems.length + ")");
                nr = -1;
            }
        }
        return nr;
    }

    /**
     * Prints out a console menu
     * with a header text and a list
     * of menu options. The menu
     * options will be assigned the numbers
     * from 1 to the number of
     * options in the menu.
     */
    private void showMenu() {
        clear();
        System.out.println(header);
        int i = 1;
        for (String menuItem : menuItems) {
            System.out.println(i + ": " + menuItem);
            i++;
        }
        System.out.println(EXIT_OPTION + ": Exit");
    }

    /**
     * Waits until the 'enter' key is pressed.
     */
    protected void pause() {
        System.out.println("Hit enter to continue...");
        scanner.nextLine();

    }

    /**
     * Clears the screen by writing several empty lines.
     */
    protected void clear() {
        for (int i = 0; i < 10; i++)
        {
            System.out.println();
        }
    }

}