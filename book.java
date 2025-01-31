/**
 * UML Diagram Representation:
 * 
 *  +----------------------+
 *  |        Book         |
 *  +----------------------+
 *  | - title: String      |
 *  | - author: String     |
 *  | - publicationYear: int |
 *  | - genre: String      |
 *  | - price: double      |
 *  +----------------------+
 *  | + Book(String, String, int, String, double) |
 *  | + displayDetails(): void                    |
 *  | + applyDiscount(double): void               |
 *  | + isClassic(): boolean                      |
 *  +----------------------+
 */

class Book {
    // Attributes
    private String title;
    private String author;
    private int publicationYear;
    private String genre;
    private double price;

    // Constructor
    public Book(String title, String author, int publicationYear, String genre, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.price = price;
    }

    // Methods
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Price: $" + price);
    }

    public void applyDiscount(double discountPercentage) {
        price -= price * (discountPercentage / 100);
        System.out.println("New price after discount: $" + price);
    }

    public boolean isClassic() {
        return publicationYear < 1970;
    }


}
