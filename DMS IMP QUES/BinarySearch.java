import java.util.Scanner;
public class BinarySearch {
    public static int search(int arr[] , int data){
        int low =0; 
        int high = arr.length-1;
        while(high >= low){
            int mid = (low + high )/2;
            if(data > arr[mid]){
                low = mid + 1;
            } else if(data < arr[mid]){
                high = mid -1;
            } else{
              return mid;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.print("Enter  elements of the array in sorted order one by one: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element which you want to search: ");
        int data = sc.nextInt();
        int index = search(arr, data);
        if( index != -1){
            System.out.print("element found at index: "+ index);
        } else{
            System.out.print("Element not found in the array.");
        }
    }
}
