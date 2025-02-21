public class Main {
    public static void main(String[] args) {
        String[] petHabits = {"Chasing balls", "Barking", "Eating"};
        Pet pet1 = new Pet("Dog", "Buddy", 3, 75, petHabits);

        Human mother = new Human("Jane", "Doe", 30, 110, new String[][]{{"Monday", "9am-5pm"}, {"Tuesday", "9am-5pm"}});
        Human father = new Human("John", "Doe", 35, 120, new String[][]{{"Monday", "10am-6pm"}, {"Tuesday", "10am-6pm"}});
        Human child = new Human("Alex", "Doe", 10, 95, new String[][]{{"Monday", "School"}, {"Tuesday", "School"}});

        Family family = new Family(mother, father);
        family.addChild(child);
        family.setPet(pet1);
        child.setFamily(family);
    }
}
