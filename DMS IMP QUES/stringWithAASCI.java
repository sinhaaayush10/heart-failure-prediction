
import java.util.Scanner;

public class stringWithAASCI{
    public static String printAASCI(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length();i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i-1);
            int gap = curr-pre;
            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.println(printAASCI(str));
    }
}
