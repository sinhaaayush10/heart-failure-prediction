class Parent {
    final int num = 100;
    void show() {
        System.out.println("This is the Parent class.");
    }
}
class Child extends Parent {
    static int count = 0;
    Child() {
        count++;
    }
    void display() {
        super.show();
        System.out.println("This is the Child class.");
        System.out.println("Final variable num = " + num);
        System.out.println("Total objects: " + count);
    }
}
public class Main {
    public static void main(String[] args) { 
        Child obj1 = new Child();
        obj1.display();
      
        Child obj2 = new Child();
        obj2.display();
    }
}

