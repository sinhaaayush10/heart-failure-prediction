import java.util.Scanner;
public class DigitFrequency {
    public static int countdig(int num ,int findnum){
        int count =0;
        while(num >0){
            int x = num%10;
            num = num/10;
            if(x == findnum){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        System.out.print("enter digit to count: ");
        int findnum = sc.nextInt();
     int counted = countdig(num, findnum);
     System.out.print(counted);
    }
}
