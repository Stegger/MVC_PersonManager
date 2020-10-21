package personmanager.gui.console;

import personmanager.be.Person;
import personmanager.be.Teacher;
import personmanager.bll.PersonManager;

import java.util.ArrayList;
import java.util.List;

public class Console {

    public static void main(String[] args)
    {

        PersonManager personManager = new PersonManager();

        personManager.addPerson(new Person(100, "Hans Nielsen", "hni@easv.dk"));


        for(Person person : personManager.getAllPersons())
        {
            System.out.println(person);
        }


    }

}
