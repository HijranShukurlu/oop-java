class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    public Human() {}

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    void describePet() {
        String slyness = (pet.trickLevel > 50) ? "very sly" : "almost not sly";
        System.out.println("I have a " + pet.species + ", it is " + pet.age + " years old, it is " + slyness);
    }

    boolean feedPet(boolean isTimeForFeeding) {
        if (isTimeForFeeding) {
            System.out.println("Hm... I will feed " + name + "'s " + pet.species);
            return true;
        } else {
            Random random = new Random();
            int randomValue = random.nextInt(100);
            if (pet.trickLevel > randomValue) {
                System.out.println("Hm... I will feed " + name + "'s " + pet.species);
                return true;
            } else {
                System.out.println("I think " + name + "'s " + pet.species + " is not hungry.");
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.name + " " + mother.surname : "null") +
                ", father=" + (father != null ? father.name + " " + father.surname : "null") +
                ", pet=" + pet + "}";
    }
}
