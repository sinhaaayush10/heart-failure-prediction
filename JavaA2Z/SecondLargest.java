import java.util.Scanner;
public class SecondLargest {
    public static int findSecondLargest(int arr[]){
        int largest=arr[0];
        int SL=arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                SL=largest;
                largest=arr[i];
            } else if(arr[i]>SL && arr[i] !=largest){
                SL=arr[i];
            }
        }
        return SL;
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
     int sLargest = findSecondLargest(arr);
     System.out.print(sLargest);
    
    }
}
