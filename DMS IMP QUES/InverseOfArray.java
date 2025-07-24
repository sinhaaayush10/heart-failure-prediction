import java.util.Arrays;
import java.util.Scanner;
public class InverseOfArray {
    public static int[] inverseArray(int arr[]){
        int inv[] = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            int v = arr[i];
            inv [v] = i;
        }
        return  inv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements of Array: ");
        int arr[] = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    int inverse[] = inverseArray(arr);
    System.out.print("Inverse of Array is: "+ Arrays.toString(inverse));

    }    
}
