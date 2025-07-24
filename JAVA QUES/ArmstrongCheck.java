import java.util.Scanner;
public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print();
        int a = sc.nextInt();  
        System.out.print();
        int b = sc.nextInt();    
        if (isArmstrong(a, b)) {
            System.out.println("Yes");
        } else {
            throw new ArithmeticException("ArithmeticException");
        }
    }
    public static boolean isArmstrong(int power, int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, power);
            temp /= 10;
        }
        return sum == num;
    }
}
