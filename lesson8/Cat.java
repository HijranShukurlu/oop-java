// Another concrete subclass of Animal
class Cat extends Animal {
    // Implementing the abstract method
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }

    // Not overriding the sleep() method, so it uses the default implementation
}
