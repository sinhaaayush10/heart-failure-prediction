import java.util.Scanner;
public class LargestElement{
    public static int findLE(int arr[]){
        int LE = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>LE)
            LE = arr[i];
        }
        return LE;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array- ");
        int size = sc.nextInt();
        System.out.print("Enter elements- ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        int LE = findLE(arr);
            System.out.println("Largest Value is "+LE);  
    }
}