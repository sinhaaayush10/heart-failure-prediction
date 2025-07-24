import java.util.Scanner;
public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
        int TotalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return TotalSum - actualSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int missing = findMissingNumber(arr, n);
        System.out.println("missing num is:--- "+missing);
    }
}
