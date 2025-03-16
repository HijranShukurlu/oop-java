import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // Create some students
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", "Doe", 85.5, "Male", dateFormat.parse("2000-05-15")));
        students.add(new Student(2, "Jane", "Smith", 90.0, "Female", dateFormat.parse("1999-12-25")));
        students.add(new Student(3, "Alice", "Johnson", 85.5, "Female", dateFormat.parse("2000-05-15")));
        students.add(new Student(4, "Bob", "Brown", 90.0, "Male", dateFormat.parse("1999-12-25")));

        // Sort by ID (ascending)
        Collections.sort(students); // Uses the Comparable implementation in Student
        System.out.println("Sorted by ID (ascending):");
        students.forEach(System.out::println);

        // Sort by grade (descending) using GradeComparator
        Collections.sort(students, new Student.GradeComparator()); // Uses the custom Comparator
        System.out.println("\nSorted by grade (descending):");
        students.forEach(System.out::println);
    }
}
