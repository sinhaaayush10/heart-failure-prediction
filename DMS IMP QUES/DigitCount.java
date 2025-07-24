import java.util.Scanner;
public class DigitCount{
    public static int CountingNum(int n, int value){
        int temp=0;
        for(; n>0;n=n/10){
        if( n%10 == value){
            temp++;
        }
    }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Enter value you want to count: ");
        int value= sc.nextInt();

        int count = CountingNum(n, value);
        System.out.print("occurance of "+value+" is "+ count);
    }
}
