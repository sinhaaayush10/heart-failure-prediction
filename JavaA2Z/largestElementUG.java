import java.util.Scanner;
public class largestElementUG {
    public static int findLargestElement(int arr[]){
        int LE = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>LE)
            LE = arr[i];
        }
        return LE;
    }
    public static void main(String[] args) {
     System.out.print("Enter Array size:- ");
     Scanner sc = new Scanner(System.in);
     int size= sc.nextInt();
     int arr[]= new int[size];
     for(int i=0; i<size; i++){
        arr[i]= sc.nextInt();
     }
     int LargestValue = findLargestElement(arr);
     System.out.print("The Largest Value in The Array is: "+LargestValue);

    }

    }
    

