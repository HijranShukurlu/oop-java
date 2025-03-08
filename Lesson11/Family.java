import java.util.Arrays;
import java.util.Random;

public class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private Human[] children = new Human[0];
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        children = Arrays.copyOf(children, children.length + 1);
        children[children.length - 1] = child;
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (index < 0 || index >= children.length) return false;
        Human[] newChildren = new Human[children.length - 1];
        for (int i = 0, j = 0; i < children.length; i++) {
            if (i != index) {
                newChildren[j++] = children[i];
            }
        }
        children = newChildren;
        return true;
    }

    public boolean deleteChild(Human child) {
        for (int i = 0; i < children.length; i++) {
            if (children[i].equals(child)) {
                return deleteChild(i);
            }
        }
        return false;
    }

    public int countFamily() {
        return 2 + children.length;
    }

    @Override
    public Human bornChild() {
        Random random = new Random();
        String[] boyNames = {"Alex", "John", "Michael"};
        String[] girlNames = {"Anna", "Jane", "Mary"};
        String name = random.nextBoolean() ? boyNames[random.nextInt(boyNames.length)] : girlNames[random.nextInt(girlNames.length)];
        int iq = (mother.getIqLevel() + father.getIqLevel()) / 2;
        Human child = random.nextBoolean() ? new Man(name, father.getSurname(), 0, iq, null) : new Woman(name, father.getSurname(), 0, iq, null);
        child.setFamily(this);
        addChild(child);
        return child;
    }

    @Override
    public String toString() {
        return "Family members: {Mother=" + mother + ", Father=" + father + ", Children=" + Arrays.toString(children) + ", pet=" + pet + "}";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Family object is being garbage collected: " + this);
        super.finalize();
    }
}
