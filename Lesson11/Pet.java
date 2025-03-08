import java.util.Arrays;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println(nickname + " is eating.");
    }

    public abstract void respond();

    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    @Override
    public String toString() {
        return species + "{nickname=" + nickname + ", age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }
}
