import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iqLevel;
    private String[][] schedule;
    private Family family;

    static {
        System.out.println("Loading class: Human");
    }

    {
        System.out.println("Creating a new Human object");
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iqLevel, String[][] schedule) {
        this(name, surname, year);
        this.iqLevel = iqLevel;
        this.schedule = schedule;
    }

    public void greetPet() {
        if (family != null && family.getPet() != null) {
            System.out.println("Hello, " + family.getPet().getNickname());
        }
    }

    public void describePet() {
        if (family.getPet().getTrickLevel() > 50) {
            System.out.printf("I have an %s, it is %d years old, he is very sly.%n", family.getPet().getSpecies(), family.getPet().getAge());
        } else {
            System.out.printf("I have an %s, it is %d years old, he is almost not sly.%n", family.getPet().getSpecies(), family.getPet().getAge());
        }
    }

    boolean feedPet(boolean isTimeForFeeding) {
        if (isTimeForFeeding) {
            System.out.println("Hm... I will feed " + name + "'s " + family.getPet().getSpecies());
            return true;
        } else {
            Random random = new Random();
            int randomValue = random.nextInt(100);
            if (family.getPet().getTrickLevel() > randomValue) {
                System.out.println("Hm... I will feed " + name + "'s " + family.getPet().getSpecies());
                return true;
            } else {
                System.out.println("I think " + name + "'s " + family.getPet().getSpecies() + " is not hungry.");
                return false;
            }
        }
    }
}
