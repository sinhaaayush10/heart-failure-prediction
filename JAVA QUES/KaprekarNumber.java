import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Yes");
        sc.close();
    }
    
    public static boolean isKaprekar(int a) {
        if (a < 1) return false;
        String c = String.valueOf((long)a * a);
        int d = c.length();
        return d == 1 ? a == Integer.parseInt(c) : 
               Integer.parseInt(c.substring(0, d/2)) + Integer.parseInt(c.substring(d/2)) == a;
    }
}