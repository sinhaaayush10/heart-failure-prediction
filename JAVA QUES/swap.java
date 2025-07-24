import java.util.Arrays;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int k = scanner.nextInt();
        System.out.println();
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println();
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        if (k > 0 && k <= size) {
            int temp = arr[k - 1]; 
            arr[k - 1] = arr[size - k]; 
            arr[size - k] = temp;
        }
        System.out.println();
       System.out.print(arr[i] + (i < size - 1 ? " " : ""));
    }
}
