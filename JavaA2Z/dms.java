import java.util.Scanner;
class SquareThread extends Thread {
    int n;
    SquareThread(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Squares:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
        }
    }
}
class CubeThread extends Thread {
    int n;
    CubeThread(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Cubes:");
        for (int i = 1; i <= n; i++) {
            System.out.println("Cube of " + i + " = " + (i * i * i));
        }
    }
}
class FactorialThread extends Thread {
    int n;
    FactorialThread(int n) {
        this.n = n;
    }
    public void run() {
        System.out.println("Factorials:");
        for (int i = 1; i <= n; i++) {
            long fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            System.out.println("Factorial of " + i + " = " + fact);
        }
    }
}
public class dms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        // Create threads
        SquareThread t1 = new SquareThread(n);
        CubeThread t2 = new CubeThread(n);
        FactorialThread t3 = new FactorialThread(n);
        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
