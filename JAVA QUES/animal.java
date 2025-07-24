class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land.");
    }
}
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("This bird flies in the sky.");
    }
}
public class Main {
    public static void main(String[] args) {
           Dog dog = new Dog();
        dog.eat(); 
        dog.walk(); 
        dog.bark();      
        Bird bird = new Bird(); 
        bird.eat(); 
        bird.fly(); 
    }
}
