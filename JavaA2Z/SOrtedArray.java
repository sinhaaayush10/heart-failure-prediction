import java.util.Scanner;
public class SOrtedArray {
    public static boolean checkSorted(int arr[]){
        boolean isSorted = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]> arr[i+1]){
            isSorted = false;}
        }
        return isSorted;
    }
    public static void main(String[] args) {
     System.out.print("Enter Array size:- ");
     Scanner sc = new Scanner(System.in);
     int size= sc.nextInt();
     System.out.print("Enter The Numbers: ");
     int arr[]= new int[size];
     for(int i=0; i<size; i++){
        arr[i]= sc.nextInt();
     }
    boolean checkedSorted = checkSorted(arr);
    System.out.print("The Following No Series is " +(checkedSorted ? "" : "not ")+"sorted"); 
}
}
