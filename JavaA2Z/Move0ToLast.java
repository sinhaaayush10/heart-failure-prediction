import java.util.Scanner;
public class Move0ToLast {
    public static void moveZeroToLast(int arr[]){
        int index=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] != 0){
                arr[index] =arr[i];
                index++;
            }
        }
        while(index <arr.length){
            arr[index]=0;
            index++;
        }
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
    moveZeroToLast(arr);
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
    }
}