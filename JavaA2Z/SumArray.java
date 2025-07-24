import java.util.Scanner;
public class SumArray {

    public static int SumOfArray(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum=arr[i]+sum;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.print("Enter Size Of Array:- ");
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        System.out.print("Enter Elements One By One:- ");
        int arr[] = new int[size];
        for(int i=0; i<arr.length;i++){
             arr[i]= scanner.nextInt();
        }
        int sum= SumOfArray(arr);
        System.out.print("Sum Of Array Is:- "+sum);
    }
    
}
