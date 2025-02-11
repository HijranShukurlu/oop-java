import java.util.Random;
import java.util.Objects;
import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iqLevel;
    private String[][] schedule;
    private Family family;

    public Human(String name,String surname,int year){
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    public Human(String name, String surname, int year, int iqLevel,String[][] schedule){
        this.name=name;
        this.surname=surname;
        this.year=year;
        this.iqLevel=iqLevel;
        this.schedule=schedule;
    }
    public Human(){};

    public void greetPet() {
        if (family != null && family.getPet() != null) {
            System.out.println("Hello, " + family.getPet().getNickname());
        }
    }

    public void describePet(){
        if(family.getPet().getTrickLevel()>50){
            System.out.printf("I have an"+family.getPet().getSpecies()+" is "+family.getPet().getAge()+" years old,he is very sly.");
        }else {
            System.out.printf("I have an"+family.getPet().getSpecies()+" is "+family.getPet().getAge()+" years old,he is almost not sly.");
        }
    }

    boolean feedPet(boolean isTimeForFeeding) {
        if (isTimeForFeeding) {
            System.out.println("Hm... I will feed " + name + "'s " + family.getPet().getSpecies());
            return true;
        } else {
            Random random = new Random();
            int randomValue = random.nextInt(100);
            if (family.getPet().getTrickLevel()> randomValue) {
                System.out.println("Hm... I will feed " + name + "'s " + family.getPet().getSpecies());
                return true;
            } else {
                System.out.println("I think " + name + "'s " + family.getPet().getSpecies()+ " is not hungry.");
                return false;
            }
        }
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return surname;
    }
    public void SetSurname(String surname){
        this.surname=surname;
    }

    public int getAge(){
        return year;
    }
    public void setAge(int year){
        this.year=year;
    }

    public int getIqLevel(){
        return iqLevel;
    }
    public void setIqLevel(int iqLevel){
        this.iqLevel=iqLevel;
    }

    public String[][] getSchedule(){
        return schedule;
    }
    public void setSchedule(String[][] schedule){
        this.schedule=schedule;
    }

    public Family getFamily(){
        return family;
    }
    public void setFamily(Family family){
        this.family=family;
    }

    @Override
    public String toString(){
        return "Human{name="+name+"surname="+surname+"year="+year+",iq="+iqLevel+", schedule=" + Arrays.deepToString(schedule)+"}";
    }

    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(!(o instanceof Human human)){
            return false;
        }
        else{
            return year == human.year && iqLevel == human.iqLevel && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
        }
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,surname,year,iqLevel)+Arrays.deepHashCode(schedule);
    }
}


