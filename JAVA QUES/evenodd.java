import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Sorting the array based on even-odd criteria
        Arrays.sort(arr, (a, b) -> {
            if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)) {
                return a - b;
            }
            return (a % 2 == 0) ? -1 : 1;
        });

        // Printing the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
