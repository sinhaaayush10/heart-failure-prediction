class A {
    int a = 10;
    public void showA() {
        System.out.println(a);
    }
}
class B extends A {
    int b = 20;
    public void showB() {
        System.out.println(b);
    }
}
class C extends B {
    int c = 30;
    public void showC() {
        System.out.println(c);
    }
}
interface Interface1 {
    int e = 50;
    void showE(); 
}
interface Interface2 {
    int f = 60;
    void showF(); 
}
class E implements Interface1, Interface2 {
    public void showE() {
        System.out.println(e);
    }
    public void showF() {
        System.out.println(f);
}}
public class inheritance {
    public static void main(String[] args) {
        B objB = new B();
        objB.showA(); 
        objB.showB(); 
        C objC = new C();
        objC.showA(); 
        objC.showB();
        objC.showC(); 
        D objD = new D();
        objD.showA(); 
        objD.showD();
        E objE = new E();
        objE.showE(); 
        objE.showF();
    }
}
