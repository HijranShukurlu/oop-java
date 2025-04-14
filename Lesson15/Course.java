import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String title;
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    Course() {}

    Course(String id, String title, Teacher teacher) {
        this.id = id;
        this.title = title;
        this.teacher = teacher;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
