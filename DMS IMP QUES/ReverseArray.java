import java.util.Scanner;
public class ReverseArray{
    public static void revarr(int arr[]){
        for(int i=0;  i<arr.length/2;i++){
            int temp =arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]= temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter arr size: ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.print("Enter elements one by one- ");
        for(int i =0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        revarr(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
