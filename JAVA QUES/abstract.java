abstract class DemoAbstract {
 public DemoAbstract() {
        System.out.println("Constructor");
    }
    abstract void a(); 
      public void b()
 { 
        System.out.println("Non-static method");
    }
    public static void c()
 { 
        System.out.println("Static method ");
    }
}
class ConcreteClass extends DemoAbstract {
        void a() {
        System.out.println("Abstract method");
    }
}
public class Abstract {
    public static void main(String[] args) {
            ConcreteClass obj = new ConcreteClass();
          obj.a();
        obj.b();
       DemoAbstract.c();
    }
}
