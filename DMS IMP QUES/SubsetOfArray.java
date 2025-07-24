import java.util.Scanner;
public class SubsetOfArray {
    public static void SubsetFound(int arr[]){
        int limit = (int)Math.pow(2, arr.length);
        for(int i=0; i<limit;i++){
            String set = "";
            int temp =i;
            for(int j=arr.length -1; j >=0;j--){
                int r = temp%2;
                temp /= 2;
                if(r ==0){
                    set = "-\t" +set;
                } else{
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements of the array one by one: ");
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        SubsetFound(arr);
    }
    
}
