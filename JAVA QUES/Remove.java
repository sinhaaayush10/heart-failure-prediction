import java.util.Arrays;
import java.util.Scanner;
public class Remove {
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
              for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];
        for (int i = 0; i < j; i++) {
     System.out.print(temp[i] + " ");
        }
        sc.close();
    }
}
