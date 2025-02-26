// Concrete subclass of Animal
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    // Overriding the non-concrete method
    @Override
    public void sleep() {
        System.out.println("The dog sleeps in a dog bed.");
    }
}
