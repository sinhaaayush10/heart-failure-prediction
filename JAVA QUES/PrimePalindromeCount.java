import java.util.Scanner;
public class PrimePalindromeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int primeCount = 0;
        int palindromeCount = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
            if (isPalindrome(i)) {
                palindromeCount++;
            }
        }
        System.out.println("Prime count: " + primeCount);
        System.out.println("Palindrome count: " + palindromeCount);
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}
