class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {  // Method overriding
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {  // Method overriding
        System.out.println("Cat meows: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal;  // Reference of parent class
        
        myAnimal = new Animal();  // Animal object
        myAnimal.makeSound();     // Output: Animal makes a sound
        
        myAnimal = new Dog();     // Dog object
        myAnimal.makeSound();     // Output: Dog barks: Woof!
        
        myAnimal = new Cat();     // Cat object
        myAnimal.makeSound();     // Output: Cat meows: Meow!
    }
}