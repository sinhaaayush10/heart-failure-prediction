import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x: ");
        int x = sc.nextInt();
        for(int i =1;i<=x;i++){
            int a = i *1;
            System.out.println("x "+"* "+i +" = "+a+"x");
        }
    }
}
