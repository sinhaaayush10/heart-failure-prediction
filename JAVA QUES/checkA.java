import java.util.Scanner;
public class PrimePalindromeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter start and end:");
        int s = sc.nextInt();
        int e = sc.nextInt();
        int pc = 0, palc = 0;
        for (int n = s; n <= e; n++) {
            if (isPrime(n)) pc++;
            if (isPalindrome(n)) palc++;
        }
          System.out.println("Prime count: " + pc);
        System.out.println("Palindrome count: " + palc);
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
        public static boolean isPalindrome(int n) {
        int org = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return org == rev;
    }
}
