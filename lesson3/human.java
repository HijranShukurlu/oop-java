public class human {
    String name;
    String surname;
    int year;
    int iqLevel;
    Pet pet;
    human mother;
    human father;

    public void greetPet(){
        System.out.println("Hello,%s.",this.pet.nickname);
    }
    public void describePet(){
        if(this.pet.trickLevel>50){
            System.out.printf("I have an %s is %d years old,he is very sly.",this.pet.species,this.pet.age);
        }else {
            System.out.printf("I have an %s is %d years old,he is almost not sly.", this.pet.species, this.pet.age);
        }
    }
    @Override public void toString(){
        System.out.println("Human{name='%s',surname='%s',year=%d,iq=%d,mother=%s,father=%s,pet=%s{nickname='%s',age=%d,trickLevel=%s,habits=[eat,drink,sleep]}",this.name,this.surname,this.year,this.iqLevel,this.mother,this.father,this.pet.nickname,this.pet.age,this.pet.trickLevel);
    }
}

