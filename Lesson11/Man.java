public final class Man extends Human {
    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, int year, int iqLevel, String[][] schedule) {
        super(name, surname, year, iqLevel, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hey, " + getFamily().getPet().getNickname() + "!");
    }

    public void repairCar() {
        System.out.println("I'm repairing the car.");
    }
}
