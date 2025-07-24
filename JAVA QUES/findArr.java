import java.util.Scanner;
public class findArr{
static void printArray(int arr[], int n){
System.out.print("Reversed Array is:-  \n");
for(int i=0; i<n; i++){
System.out.print(arr[i]+ " ");
}
}
static void reverseArray(int arr[], int n){
int p1= 0, p2 = n-1;
while(p1<p2){
int tmp = arr[p1];
arr[p1] = arr[p2];
arr[p2] = tmp;
p1++;
p2--;
}
printArray(arr, n);
}
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt(); 
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
}
reverseArray(arr, n);
}
}
