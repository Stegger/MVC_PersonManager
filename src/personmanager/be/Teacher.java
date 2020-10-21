package personmanager.be;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private List<String> subjects;
    private String initials;

    public Teacher(int id, String name, String email) {
        super(id, name, email);
        subjects = new ArrayList<>();
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }
}
