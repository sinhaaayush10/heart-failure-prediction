import java.util.Scanner;
public class ArraySSum {
            public static int SumArray(int arr[]){
                int temp=0;
                for(int i=0;i<arr.length;i++){
                    temp = temp+ arr[i];
                }
                return temp;
            }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements one by one: ");
        int arr[]= new int[size];
        for(int i=0; i<size;i++){
            arr[i]= sc.nextInt();
        } 
        int sum = SumArray(arr);
        System.out.print("Sum of all "+size+" elements is: "+sum);
    }
}
