public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;
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
    public Pet(){}

    public void eat(){
        System.out.println("I am eating.");
    }
    public void respond(){
        System.out.printf("Hello,owner.I am %s.I miss you.",this.nickname);
    }
    public void foul(){
        System.out.println("I need to cover it up.");
    }
    @Override public void toString(){
        System.out.printf("%s{nickname='%s',age=%d,trickLevel=%s,habits=[eat,drink,sleep]}",this.species,this.nickname,this.trickLevel);
    }

}
