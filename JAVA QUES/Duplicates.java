import java.util.Arrays;
import java.util.Scanner;
public class Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] temp = new int[arr.length];
        int j = 0; 
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
                temp[j++] = arr[i]; // Add to temp only if it's not a duplicate
            }
        }
        if (j == 0) {
        } else {
            for (int i = 0; i < j; i++) {
                System.out.print(temp[i] + " ");
            }
        }
        sc.close();
    }
}
