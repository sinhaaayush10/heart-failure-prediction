import java.util.Scanner;
public class CeilAndFloor {
    public static void findCeilFloor(int arr[],int data){
        int low=0;
        int high=arr.length-1;
        int ceil=0;
        int floor=0;
        while(high>= low){
            int mid = (low+high)/2;
            if(data <arr[mid]){
                high = mid-1;
                ceil = arr[mid];
            }
            else if(data > arr[mid]){
                low = mid+1;
                floor = arr[mid];
            }
            else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil+"\t");
        System.out.print(floor);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements in array 1 by 1: ");
        int arr[]= new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter element: ");
        int data = sc.nextInt();

        findCeilFloor(arr, data);
    }
}
