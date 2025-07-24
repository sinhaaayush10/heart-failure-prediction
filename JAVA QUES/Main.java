class Animal {
    void eat() {
        System.out.println("HELLLOOO");
    }
}
class Mammal extends Animal { 
                                      //OVERRIDDING YAHA PR KIYE SIR
      void eat() {
        System.out.println("HIIIIIIIIIIII");
    }
    void walk() {
        System.out.println("WALKKKKKKKK");
    }
}
class Dog extends Mammal {
    void eat() {
        System.out.println("DOGGGG");
    }
    void bark() {
        System.out.println("DDDDDD");
    }
}
class Bird extends Animal {
    void eat() {
        System.out.println("PEGION");
    }

    void fly() {
        System.out.println("SKYYYYIIEE");
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
