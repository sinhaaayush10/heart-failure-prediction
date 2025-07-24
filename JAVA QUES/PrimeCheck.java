import java.util.Scanner;
class PrimeCheck{
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println();
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println();
        for (int num : array) {
            if (isPrime(num)) {
                System.out.println("Item  is prime.");
            } else {
                System.out.println("Item is not prime.");
            }
        }
        scanner.close();
    }
}
