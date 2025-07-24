import java.util.Scanner;
public class SpanOfArray {

    public static int FindMax(int arr[]){
       int LE= arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i] > LE)
            LE= arr[i];
       }
       return LE;
    } 
     
    public static int FindMin(int arr[]){
        int SE = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<SE)
            SE = arr[i];
        }
        return SE;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        System.out.print("Enter elements one by one: ");
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int MAX = FindMax(arr);
        int MIN = FindMin(arr);
        int Result = MAX -MIN;
        System.out.println("Span of Element is: "+Result);

    }
    
}
