import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children=new Human[0];
    private Pet pet;

    static {
        System.out.println("Loading class: Family");
    }

    {
        System.out.println("Creating a new Family object");
    }

    public Family(Human mother,Human father){
        this.mother=mother;
        this.father=father;
    }

    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child){
        children=Arrays.copyOf(children,children.length+1);
        children[children.length-1]=child;
        child.setFamily(this);
    }

    public boolean deleteChild(int index){
        if (index < 0 || index >= children.length) return false;
        Human[] newChildren= new Human[children.length-1];
        for(int i=0,j=0;i< children.length;i++){
            if(i!=index){
                newChildren[j++]=children[i];
            }
        }
        children=newChildren;
        return true;
    }

    public boolean deleteChild(Human child){
        for(int i=0;i<children.length;i++){
            if(children[i].equals(child)){
                return deleteChild(i);
            }
        }
        return false;
    }

    public int countFamily(){
        return 2+children.length;
    }

    @Override
    public String toString(){
        return "Family members:{"+"Mother="+mother+",Father="+father+"Children={"+ Arrays.toString(children)+"},"+"pet={nickname="+pet.getNickname()+"age="+pet.getAge()+"trickLevel="+pet.getTrickLevel()+"habits="+Arrays.toString(pet.getHabits());
    }

}


