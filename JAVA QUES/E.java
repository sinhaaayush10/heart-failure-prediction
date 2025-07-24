import java.util.Scanner;

// Custom exception for negative integers
class E extends Exception {
    public E(String message) {
        super(message);
    }
}

public class AA {

    // Method to calculate factorial
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
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        try {
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (NegativeIntegerException e) {
            System.out.println(e.getMessage());
        }
    }
}
