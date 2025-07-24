import java.util.Scanner;
public class MoveZeroToEnd {
    public static void MoveZeros(int arr[]){
        int index =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while(arr.length > index){
            arr[index] = 0;
            index++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array: ");
        int size = sc.nextInt();
        System.out.print("enter elements one by one: ");
        int arr[] = new int[size];
        for(int i=0; i<size;i++){
            arr[i]= sc.nextInt();
        }
        MoveZeros(arr);
        // for(int value:arr){
        //     System.out.print(value+"\t"); 
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        }
    }
    

