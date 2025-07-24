import java.util.Arrays;
import java.util.Scanner;
public class RotateArray {
    public static void rotate(int nums[] , int k){
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums , 0,k-1);
        reverse(nums ,k,nums.length-1);
    }
    public static void reverse(int nums[],int start, int end){
        while(end> start){
            int temp = nums[start];
            nums[start] =nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of array: ");
        int n = sc.nextInt();
        System.out.print("enter elements in array: ");
        int arr[] = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.print("Enter K: ");
        int k =sc.nextInt();
        rotate(arr, k);
        System.out.print(Arrays.toString(arr)+"\t");
    }
    
}
