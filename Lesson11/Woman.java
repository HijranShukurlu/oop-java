public final class Woman extends Human {
    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, int year, int iqLevel, String[][] schedule) {
        super(name, surname, year, iqLevel, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hi, " + getFamily().getPet().getNickname() + "!");
    }

    public void makeup() {
        System.out.println("I'm doing my makeup.");
    }
}
