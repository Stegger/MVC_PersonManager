package personmanager.bll;

import personmanager.be.Person;
import personmanager.be.Student;
import personmanager.be.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class PersonManager {


    private List<Person> allPersons;

    public PersonManager() {
        allPersons = new ArrayList<>();
        //For test purpose only:
        allPersons.add(new Student(1, "Little Jeppe", "lj@easv365.dk", "MultiMedia Design"));
        allPersons.add(new Teacher(100, "Peter Stegger", "pgn@easv.dk"));
    }

    public void addPerson(Person person) {
        if (getPerson(person.getId()) == null) {
            allPersons.add(person);
        }
    }

    /**
     * Gets the Person object with the given ID.
     *
     * @param id The ID of the Person to search for.
     * @return The Person with the given ID, or Null if no such person exists.
     */
    public Person getPerson(int id) {
        for (Person person : allPersons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Person getPersonBinary(int id) {
        allPersons.sort((o1, o2) -> o1.getId() - o2.getId());

        int first = 0;
        int last = allPersons.size() - 1;

        while (first <= last) {
            int middle = last + ((first - last) / 2);

            Person middlePerson = allPersons.get(middle);

            if (middlePerson.getId() == id) {
                return middlePerson;
            } else if (middlePerson.getId() < id) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return null;
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

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (Person person : allPersons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                students.add(student);
            }
        }
        return students;
    }


}
