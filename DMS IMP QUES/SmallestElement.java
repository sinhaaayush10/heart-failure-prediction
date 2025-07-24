import java.util.Scanner;
public class SmallestElement{
    public static int findSmallestElement(int arr[]){
        int SE = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<SE)
            SE = arr[i];
        }
        return SE;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total No of elements:- ");
        int size = sc.nextInt();
        System.out.print("Enter Elements:- ");
        int arr[] = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int SE = findSmallestElement(arr);
        System.out.print("The Smallest Element in array is: "+SE);
    }


}
