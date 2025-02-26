public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling methods
        dog.makeSound(); // Output: The dog barks.
        dog.eat();       // Output: This animal eats food.
        dog.sleep();    // Output: The dog sleeps in a dog bed.

        cat.makeSound(); // Output: The cat meows.
        cat.eat();       // Output: This animal eats food.
        cat.sleep();     // Output: This animal sleeps. (default implementation)
    }
}
