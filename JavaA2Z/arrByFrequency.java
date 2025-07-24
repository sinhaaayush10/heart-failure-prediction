import java.util.Scanner;
public class arrByFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
                int[] freq = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            freq[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    visited[j] = true;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (freq[i] < freq[j]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    // Swap frequencies
                    int tempF = freq[i];
                    freq[i] = freq[j];
                    freq[j] = tempF;
                }
            }
        }
        boolean[] printed = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!printed[i]) {
                for (int j = 0; j < freq[i]; j++) {
                    System.out.print(arr[i] + " ");
                }
                printed[i] = true;
                // Mark all duplicates as printed
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] == arr[i]) {
                        printed[j] = true;
                    }
                }
            }
        }
    }
}
