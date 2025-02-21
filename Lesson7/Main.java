public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10_000_000; i++) {
            new Human("Temp", "Person", 1990);
        }
        System.gc();
    }
}
