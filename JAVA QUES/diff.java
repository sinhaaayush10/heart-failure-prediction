import java.util.Scanner;
public class diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
           int primeSum = 0;
        int nonPrimeSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (isPrime(arr[i])) {
                primeSum += arr[i]; 
            } else {
                nonPrimeSum += arr[i]; 
            }
        }
         int difference = primeSum - nonPrimeSum;
        System.out.println(difference);
    }
        public static boolean isPrime(int num) {
        if (num <= 1) { 
            return false;
        }
        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
