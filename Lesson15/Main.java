import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<Exam> exams = new ArrayList<>();

        Teacher t1 = new Teacher("T1", "Alice", 35, "female", "alice@example.com");
        Teacher t2 = new Teacher("T2", "Bob", 40, "male", "bob@example.com");
        teachers.add(t1);
        teachers.add(t2);
        
        Student s1 = new Student("S1", "Emily Carter", 21, "female", "emily.carter@mail.com");
        Student s2 = new Student("S2", "Liam Nguyen", 22, "male", "liam.nguyen@mail.com");
        Student s3 = new Student("S3", "Sophia Patel", 23, "female", "sophia.patel@mail.com");
        Student s4 = new Student("S4", "Noah Kim", 24, "male", "noah.kim@mail.com");
        Student s5 = new Student("S5", "Olivia Lopez", 25, "female", "olivia.lopez@mail.com");

        List<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
        
        for (Student student : students) {
            Course c1 = new Course(UUID.randomUUID().toString(), "Math", t1);
            Course c2 = new Course(UUID.randomUUID().toString(), "Science", t2);

            c1.addStudent(student);
            c2.addStudent(student);
            student.enroll(c1);
            student.enroll(c2);

            courses.add(c1);
            courses.add(c2);

            t1.teach(c1);
            t2.teach(c2);
   
            exams.add(new Exam(UUID.randomUUID().toString(), student, c1, new Random().nextInt(101)));
            exams.add(new Exam(UUID.randomUUID().toString(), student, c2, new Random().nextInt(101)));
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            mapper.writeValue(new File("students.json"), students);
            mapper.writeValue(new File("teachers.json"), teachers);
            mapper.writeValue(new File("courses.json"), courses);
            mapper.writeValue(new File("exams.json"), exams);
            System.out.println("Data written to JSON files successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
