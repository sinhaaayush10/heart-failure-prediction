import java.util.Scanner;
public class revArr {
    public static void findrevArr(int array[]){
        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i- 1];
            array[array.length - i- 1] = temp;
        }
    }
    public static void main(String[] args) {
     System.out.print("Enter Array size:- ");
     Scanner sc = new Scanner(System.in);
     int size= sc.nextInt();
     int array[]= new int[size];
     for(int i=0; i<size; i++){
        array[i]= sc.nextInt();
     }
     findrevArr(array);
     for(int i=0; i<size; i++){
        System.out.print(array[i]+ " ");
     }
    }
}
