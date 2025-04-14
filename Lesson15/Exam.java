public class Exam implements Gradable {
    private String id;
    private Student student;
    private Course course;
    private int score;

    Exam() {}

    Exam(String id, Student student, Course course, int score) {
        this.id = id;
        this.student = student;
        this.course = course;
        this.score = score;
    }

    public String getGrade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public String getId() {
        return id;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public int getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
