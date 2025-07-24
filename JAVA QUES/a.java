class A {
    public void displayA() {
        System.out.println("CLASS A");
    }
}
class B extends A {
    public void displayB() {
        System.out.println("CLASS B");
    }
}
class C extends A {
    public void displayC() {
        System.out.println("CLASS C");
    }
}
class D extends B {
    C c = new C(); 
    public void displayD() {
        System.out.println("CLASS D");
    }
    public void displayFromC() {
        c.displayC();     }
}
public class Hybrid {
    public static void main(String[] args) {
              D obj = new D();
        obj.displayA(); 
        obj.displayB();
        obj.displayD(); 
        obj.displayFromC(); 
    }
}
