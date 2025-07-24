import java.util.Scanner;
public class FirstAndLastIndex {
    public static void findFirst(int arr[], int data){
        int low = 0;
        int high = arr.length-1;
        int firstIndex = -1;
        while(high>= low){
            int mid = (low+high)/2;
            if(data > arr[mid]){
            low = mid+1;
            }
            else if(data <arr[mid]){
                high = mid-1;
            }
            else{
                firstIndex = mid;
                high = mid -1;
            }
        }
        System.out.println("firstIndex: "+firstIndex);
    }
    public static void findLast(int arr[], int data){
        int low = 0;
        int high = arr.length-1;
        int LastIndex = -1;
        while(high>= low){
            int mid = (low+high)/2;
            if(data > arr[mid]){
            low = mid+1;
            }
            else if(data <arr[mid]){
                high = mid-1;
            }
            else{
                LastIndex = mid;
                low = mid +1;
            }
        }
        System.out.print("LastIndex: "+LastIndex);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of Array: ");
        int size = sc.nextInt();
        System.out.print("Enter the elements in the array: ");
        int arr[] = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the element to find: ");
        int data = sc.nextInt();
        findFirst(arr, data);
        findLast(arr, data);
    }
}
