import java.util.Scanner;
public class BinarySubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("first binary number: ");
        String a = sc.next();
        System.out.print("second binary number: ");
        String b = sc.next();
        int c = Integer.parseInt(a, 2);
        int d = Integer.parseInt(b, 2);
        int result = c - d;
        String binaryResult = Integer.toBinaryString(result);
        System.out.println("Subtraction Result: " + binaryResult);
        sc.close();
    }
}
