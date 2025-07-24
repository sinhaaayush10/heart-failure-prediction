import java.util.Scanner;
public class DecimalToAnyBase {
    public static int convert(int num, int base){
        int count =0;
        int p=1;
        while(num>0){
            int dig = num%base;
            num = num/base;
            count +=dig*p;
            p = p*10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        System.out.println("enter num to change into base: ");
        int base = sc.nextInt();
        int converted = convert(num, base);
        System.out.println(converted);
    }
}
