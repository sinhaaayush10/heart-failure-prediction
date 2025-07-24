import java.util.Scanner;
class E extends Exception {
    public E(String message) {
        super(message);
    }
}
public class Exception {
    public static long factorial(int n) throws E {
        if (n < 0) {
            throw new E("Factorial is not defined for negative numbers.");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter INT:");
        int number = scanner.nextInt();
        try {
            long result = factorial(number);
            System.out.println(result);
        } catch (E e) {
            System.out.println(e.getMessage());
        }
    }
}
