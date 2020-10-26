package personmanager.be;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String education;
    private List<GradeInfo> gradeReport;

    public Student(int id, String name, String email, String education) {
        super(id, name, email);
        this.education = education;
        gradeReport = new ArrayList<>();
    }

    public String getEducation() {
        return education;
    }

    /**
     *
     * @param subject
     * @return The grade matching the subject if a subject is found, otherwise -1.
     */
    public int getGrade(String subject) {

        for (GradeInfo gradeInfo: gradeReport)
        {
            if(gradeInfo.getSubject().equalsIgnoreCase(subject))
            {
                return gradeInfo.getGrade();
            }
        }
        return -1;
    }

    /**
     * Returns the students object average.
     * @return
     */
    public double getAverageGrade()
    {
        double sum = 0.0;
        for(GradeInfo gradeInfo : gradeReport)
        {
            sum += gradeInfo.getGrade();
        }
        double avg = sum / gradeReport.size();
        return avg;
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
