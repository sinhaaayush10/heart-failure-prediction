import java.util.Scanner;
public class countMajority {
    public static void findMajorityElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int count = countOccurrences(arr, arr[i]);
            if (count > n / 2) {
                System.out.print(arr[i]);
                return;
            }
        }
        System.out.println("0");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findMajorityElement(arr, n);
    }
    public static int countOccurrences(int[] arr, int key) {
        int count = 0;
        for (int num : arr) {
            if (num == key) {
                count++;
            }
        }
        return count;
    }
}
