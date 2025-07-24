import java.util.Scanner;
public class SortedArray {
    public static boolean DoSorting(int arr[]){
        boolean isSorted = true;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i+1] < arr[i]){
             isSorted = false;
            }
        }
        return isSorted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements one by one: ");
        int arr[] = new int[size];
        for(int i =0; i<size; i++){
            arr[i]= sc.nextInt();
        }
        boolean SortingCheck = DoSorting(arr);
        System.out.print(SortingCheck);
    }
    
}
