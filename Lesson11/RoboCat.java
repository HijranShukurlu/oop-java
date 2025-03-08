public class RoboCat extends Pet {
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.ROBOCAT, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println(getNickname() + " is beeping.");
    }
}
