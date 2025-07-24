import java.util.Scanner;
public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num: ");
        int count =0;
        int num = 1;
        while(count<n){
            int temp = num;
            int rev=0;
            while(temp>0){
                int dig = temp % 10;
                rev = rev*10 + dig;
                temp = temp/10;
            }
            if (num==rev){
                count++;
            }
            if(count == n){
                System.out.println("num"+num);
                break;
            }
            num++;
        }
}
}