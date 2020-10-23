package personmanager.bll;

import personmanager.be.Person;
import personmanager.be.Teacher;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

    private List<Person> allPersons;

    public PersonManager() {
        allPersons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        allPersons.add(person);
    }

    public List<Person> getAllPersons() {
        return allPersons;
    }

    public List<Teacher> getAllTeachers() {
        List<Teacher> allTeachers = new ArrayList<>();

        for (Person person : allPersons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                allTeachers.add(teacher);
            }
        }
        return allTeachers;
    }


}
