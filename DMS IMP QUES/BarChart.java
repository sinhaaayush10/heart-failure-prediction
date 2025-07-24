import java.util.Scanner;
public class BarChart {
    public static int FindMax(int arr[]){
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void PrintBars(int arr[],int max){
        for(int floor = max; floor>= 1;floor--){
            for(int i=0; i<arr.length;i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size = sc.nextInt();
        System.out.print("Enter Elements");
        int arr[] = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int MAXIMUM = FindMax(arr);
        PrintBars(arr, MAXIMUM);
    }
    
}
