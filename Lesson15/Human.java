public abstract class Human {
    private String id;
    private String name;
    private int year;
    public String gender;
    private String email;

    Human() {}

    Human (String id, String name, int year, String gender, String email) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.gender = gender;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
