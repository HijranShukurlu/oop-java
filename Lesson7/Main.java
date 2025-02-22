public class Main {
    public static void main(String[] args) {
        String[] petHabits = {"Chasing balls", "Barking", "Eating"};
        Pet pet1 = new Pet(Species.DOG, "Buddy", 3, 75, petHabits);

        Human mother = new Human("Jane", "Doe", 30, 110, new String[][]{{DayOfWeek.MONDAY.name(), "9am-5pm"}, {DayOfWeek.TUESDAY.name(), "9am-5pm"}});
        Human father = new Human("John", "Doe", 35, 120, new String[][]{{DayOfWeek.MONDAY.name(), "10am-6pm"}, {DayOfWeek.TUESDAY.name(), "10am-6pm"}});
        Human child = new Human("Alex", "Doe", 10, 95, new String[][]{{DayOfWeek.MONDAY.name(), "School"}, {DayOfWeek.TUESDAY.name(), "School"}});

        Family family = new Family(mother, father);
        family.addChild(child);
        family.setPet(pet1);
        child.setFamily(family);

        System.out.println("Family Information before deletion:");
        System.out.println("Mother: " + mother);
        System.out.println("Father: " + father);
        System.out.println("Child: " + child);
        System.out.println("Family count: " + family.countFamily());
        System.out.println("Pet: " + pet1);

        System.out.println("\nChild's actions:");
        child.greetPet();
        child.describePet();
        child.feedPet(true);

        System.out.println("\nPet's actions:");
        pet1.eat();
        pet1.respond();
        pet1.foul();

        System.out.println("\nDeleting child...");
        boolean deleted = family.deleteChild(child);
        if (deleted) {
            System.out.println("Child deleted successfully.");
        } else {
            System.out.println("Child deletion failed.");
        }

        System.out.println("\nFamily Information after deletion:");
        System.out.println("Mother: " + mother);
        System.out.println("Father: " + father);
        System.out.println("Family count: " + family.countFamily());
        System.out.println("Pet: " + pet1);

        // Trigger garbage collection
        for (int i = 0; i < 1000000; i++) {
            new Human("Temp", "Temp", i);
        }
        System.gc();
    }
}
