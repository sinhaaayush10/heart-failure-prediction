import java.util.Arrays;
import java.util.Scanner;
public class MaxMinPattern {
    public static void printMaxMinPattern(int arr[]) {
        Arrays.sort(arr); 
        int i = 0;             
        int j = arr.length - 1; 
        while (i <= j) {
            if (i != j) {
                System.out.print(arr[j] + " "); 
                System.out.print(arr[i] + " "); 
            } else {
                System.out.print(arr[i]); 
            }
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        //System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.print("Pattern output: ");
        printMaxMinPattern(arr);
    }
}

