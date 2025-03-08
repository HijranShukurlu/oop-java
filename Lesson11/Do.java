public class Dog extends Pet {
    public Dog(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.DOG, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println(getNickname() + " is wagging its tail.");
    }

    public void foul() {
        System.out.println(getNickname() + " is digging in the garden.");
    }
}
