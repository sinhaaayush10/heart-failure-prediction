import java.util.Scanner;
public class ReverseAString {
    public static void reverseString1(String str){
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String :-> ");
        String str = sc.nextLine();
        //reverseString1(str);
        reverseString2(str);
    }
    public static void reverseString2(String str){
        StringBuffer sb = new StringBuffer(str);
        System.out.print(sb.reverse());
    }
}
