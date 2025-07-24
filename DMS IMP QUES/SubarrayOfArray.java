import java.util.Scanner;
public class SubarrayOfArray {
    public static void SubarrayFound(int arr[]){
        for(int i=0; i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k =i; k<=j; k++){
                    System.out.print(arr[k]+ "\t");
            }
            System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements one by one: ");
        int arr[] = new int[size];
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        SubarrayFound(arr);
    }
    
}
