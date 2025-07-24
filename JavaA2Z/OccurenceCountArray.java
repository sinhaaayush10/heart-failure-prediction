import java.util.Scanner;
public class OccurenceCountArray {
    public static int OccurenceCount(int arr[],int targetElemenet){
         int count=0;
        for(int i=0;i<arr.length;i++){
            if(targetElemenet == arr[i]){
                count++;
            }
        } 
        return count;
    }
    public static void main(String[] args) {
        System.out.print("Enter Size: ");
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter Elements in The Array:- ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter target element-: ");
        int targetElemenet = sc.nextInt();
        int occured= OccurenceCount(arr,targetElemenet);
        System.out.print(targetElemenet+" Occured for "+ occured+" times");
    }
}
