import java.util.ArrayList;
import java.util.List;

public class Student extends Human {

    private List<Course> enrolledCourses = new ArrayList<>();

    Student() {}

    Student(String id, String name, int year, String gender, String email) {
        super(id, name, year, gender, email);
    }

    void enroll(Course course) {
        enrolledCourses.add(course);
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
