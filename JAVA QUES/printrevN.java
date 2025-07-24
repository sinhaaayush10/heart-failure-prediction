import java.util.Scanner;

public class printrevN{
    static void func(int i,int n)
    {
        if(i<1)
        return;
        System.out.println(i);
        func(i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Times:");
        int n = sc.nextInt();
        func(n,n);
    }
}