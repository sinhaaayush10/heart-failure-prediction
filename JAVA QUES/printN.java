import java.util.Scanner;
public class printN {
    static void func(int i, int n){
        if(i>n)
        return;
        System.out.println(i);
        func(i+1,n);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No Of Times: ");
        int n = sc.nextInt();
        func(1,n);
    }
}
