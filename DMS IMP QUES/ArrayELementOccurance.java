import java.util.Scanner;
public class ArrayELementOccurance {
    public static int count(int arr[],int find){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== find){
                 temp++;
            }
        }
        return temp;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int arr[]= new int[size];
        System.out.print("Enter elements one by one: ");
        for(int i=0; i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.print("Element you want to count: ");
        int find= sc.nextInt(); 
        
        int count = count(arr,find);
        System.out.print("element occured "+count);
    }
    }