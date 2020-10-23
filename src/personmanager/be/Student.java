package personmanager.be;

import java.util.List;

public class Student extends Person {
    private String education;
    private List<GradeInfo> gradeReport;

    public Student(int id, String name, String email, String education) {
        super(id, name, email);
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    public int getGrade(String subject) {
        //TODO
        return 0;
    }

    public double getAverageGrade() {
        //TODO
        return 0.0;
    }

    public List<GradeInfo> getGradeReport() {
        return gradeReport;
    }

    public void addGrade(GradeInfo grade)
    {
        gradeReport.add(grade);
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "education='" + education + '\'' +
                ", gradeReport=" + gradeReport +
                '}';
    }
}
