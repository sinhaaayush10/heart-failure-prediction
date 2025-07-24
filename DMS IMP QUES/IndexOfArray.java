import java.util.Scanner;
public class IndexOfArray {
    public static int FindElement(int arr[],int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == element){
              return i;
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Element: ");
        int size = sc.nextInt();

        System.out.print("Enter Elements: ");
        int arr[] = new int[size];
        for(int i=0; i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to Find: ");
        int element = sc.nextInt();
        int index = FindElement(arr,element);
        if(index != -1){
            System.out.println(index);
        }else{
                System.out.print("ELement not found");
            }
    }
}