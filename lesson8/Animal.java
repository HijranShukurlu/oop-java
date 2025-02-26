// Abstract class with abstract, concrete, and non-concrete methods
abstract class Animal {
    // Abstract method (must be implemented by subclasses)
    public abstract void makeSound();

    // Concrete method (already implemented)
    public void eat() {
        System.out.println("This animal eats food.");
    }

    // Non-concrete method (default implementation, can be overridden)
    public void sleep() {
        System.out.println("This animal sleeps.");
    }
}
