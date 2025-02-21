import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private Family family;
    private String[][] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public void finalize() {
        System.out.println("Human " + name + " is being deleted");
    }
}
