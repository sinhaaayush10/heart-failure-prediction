public class p {
   static int x = 5;
   static int y;
   static void func(int z) {
      System.out.println("x = " + x);
      System.out.println("y = " + y);
      System.out.println("z = " + z);
   }
   static {
      y = x + 10;
   }
   public static void main(String args[]) {
      func(10);
   }
}