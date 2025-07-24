import java.util.Scanner;
public class SecondLargestArray {
    public static int FindSecondLargest(int arr[]){
        int Largest = arr[0];
        int SL = arr[1];

        for(int i=0; i<arr.length; i++){
            if(arr[i]> Largest){
                SL = Largest;
                Largest = arr[i];
            }else if(arr[i] >SL && arr[i] !=Largest){
                SL = arr[i];
            }
        }
        return SL;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Size Of Array: ");
        int size = sc.nextInt();

        System.out.print("Enter Elements in one go: ");
        int arr[]= new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        int SECONDLARGEST = FindSecondLargest(arr);
        System.out.print("2nd Largest Element in the Array is: "+SECONDLARGEST);

    }
    
}
