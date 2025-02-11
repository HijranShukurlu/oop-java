import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species,String nickname){
        this.species=species;
        this.nickname=nickname;
    }
    public Pet(String species,String nickname,int age,int trickLevel,String[] habits){
        this.species=species;
        this.nickname=nickname;
        this.age=age;
        this.trickLevel=trickLevel;
        this.habits=habits;
    }
    public Pet(){};

    public void eat(){
        System.out.println("I am eating.");
    }
    public void respond(){
        System.out.printf("Hello,owner.I am "+this.nickname+".I miss you.");
    }
    public void foul(){
        System.out.println("I need to cover it up.");
    }

    public void setNickname(String nickname){
        this.nickname=nickname;
    }
    public String getNickname(){
        return nickname;
    }
    public void setSpecies(String species){
        this.species=species;
    }
    public String getSpecies(){
        return species;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setTrickLevel(int trickLevel){
        this.trickLevel=trickLevel;
    }
    public int getTrickLevel(){
        return trickLevel;
    }
    public void setHabits(String[] habits){
        this.habits=habits;
    }
    public String[] getHabits(){
        return habits;
    }

    @Override
    public String toString(){
        return species+"{nickname="+nickname+"age="+age+"trickLevel="+trickLevel+"habits="+Arrays.toString(habits)+"}";
    }
    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(!(o instanceof Pet pet)){
            return false;
        }
        else{
            return age==pet.age && trickLevel==pet.trickLevel && Arrays.equals(habits,pet.habits) && Objects.equals(nickname,pet.nickname) && Objects.equals(species,pet.species);
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel,Arrays.hashCode(habits));
    }
}
