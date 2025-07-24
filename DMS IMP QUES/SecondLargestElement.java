import java.util.Scanner;
public class SecondLargestElement {
    public static int SecondLargestNum(int arr[]){
         int largest = arr[0];
         int SL=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest ){
                largest = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != largest){
                if(SL ==-1 || arr[i] > SL ){
                    SL = arr[i];
                }
            }
        }
        return SL;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();

        System.out.print("Enter array one by one: ");
        int arr[] = new int[size];

        for(int i=0; i<size;i++){
            arr[i]= sc.nextInt();
        }
        int secondlargest = SecondLargestNum(arr);
        System.out.print("2ND LARGEST NUM IN THIS ARRAY IS: "+secondlargest);
    }
    
}
