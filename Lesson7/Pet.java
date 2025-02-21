import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    static {
        System.out.println("Loading class: Pet");
    }

    {
        System.out.println("Creating a new Pet object");
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating.");
    }
    public void respond() {
        System.out.printf("Hello, owner. I am %s. I miss you.%n", this.nickname);
    }
    public void foul() {
        System.out.println("I need to cover it up.");
    }
}
