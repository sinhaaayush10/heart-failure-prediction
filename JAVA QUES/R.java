import java.util.*;
class SortDescending {
    static void sortDescending(int arr[]) {
        Arrays.sort(arr);
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }        sortDescending(arr);
    }
}
