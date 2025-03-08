public class DomesticCat extends Pet {
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(Species.CAT, nickname, age, trickLevel, habits);
    }

    @Override
    public void respond() {
        System.out.println(getNickname() + " is purring.");
    }

    public void foul() {
        System.out.println(getNickname() + " is scratching the furniture.");
    }
}
