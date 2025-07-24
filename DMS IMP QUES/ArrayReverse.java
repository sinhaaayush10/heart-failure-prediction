import java.util.Scanner;
public class ArrayReverse {
    public static void ReversingArray(int arr[]){
       int i=0;
       int j = arr.length-1;
       while(i < j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements one by one: ");
        int arr[] = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        ReversingArray(arr);
        System.out.println("Reversed Array is- ");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
