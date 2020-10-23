package personmanager.be;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private List<String> subjects;
    private String initials;
    private double salary;

    public Teacher(int id, String name, String email) {
        super(id, name, email);
        subjects = new ArrayList<>();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public String getInitials() {
        return initials;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher{" +
                "subjects=" + subjects +
                ", initials='" + initials + '\'' +
                ", salary=" + salary +
                '}';
    }
}
