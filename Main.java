public class Main{
    public static void main(String[] args) {
        Book myBook = new Book("1984", "George Orwell", 1949, "Dystopian", 15.99);
        myBook.displayDetails();
        myBook.applyDiscount(10); // Applying a 10% discount
        if (myBook.isClassic()) {
            System.out.println("This book is considered a classic.");
        } else {
            System.out.println("This book is not a classic.");
        }
    }
}
