import java.util.ArrayList;
import java.util.List;

public class Teacher extends Human implements Teachable {

    private List<Course> teachingCourses = new ArrayList<>();

    Teacher() {}

    Teacher(String id, String name, int year, String gender, String email) {
        super(id, name, year, gender, email);
    }

    @Override
    public void teach(Course course) {
        teachingCourses.add(course);
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

    public void setTeachingCourses(List<Course> teachingCourses) {
        this.teachingCourses = teachingCourses;
    }
}
