class Human {
    private String name;
    private String surname;
    private int year;
    private String[][] schedule;
    private Family family;

    public Human(String name, String surname, int year, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = schedule;
    }

    public void finalize() {
        System.out.println("Human object is being removed: " + name + " " + surname);
    }
}
