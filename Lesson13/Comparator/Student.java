import java.util.Comparator;
import java.util.Date;

public class Student {

    private int ID;
    private String name;
    private String surname;
    private double grade;
    private String gender;
    private Date birthdate;

    public Student(int ID, String name, String surname, double grade, String gender, Date birthdate) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getGrade() {
        return grade;
    }

    public String getGender() {
        return gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString(){
        return "Student{" +
                "id=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grade=" + grade +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }

    @Override
    public int compareTo(Student other){
        return Integer.compare(this.ID,other.ID);
    }

    public static class GradeComparator implements Comparator<Student>{
        @Override
        public int compare(Student s1,Student s2){
            int gradeCompare=Double.compare(s1.getGrade(),s2.getGrade());
            if(gradeCompare!=0){
                return gradeCompare;
            }

            int birthdateCompare = s2.getBirthdate().compareTo(s1.getBirthdate());
            if (birthdateCompare != 0) {
                return birthdateCompare;
            }

            int genderCompare = s2.getGender().compareTo(s1.getGender());
            if (genderCompare != 0) {
                return genderCompare;
            }

            int nameCompare = s2.getName().compareTo(s1.getName());
            if (nameCompare != 0) {
                return nameCompare;
            }

            return s2.getSurname().compareTo(s1.getSurname());
        }
    }

}
