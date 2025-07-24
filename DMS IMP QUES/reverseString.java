import java.util.Scanner;
public class reverseString {
    public static void reversing(char[] s){
        int left=0,right = s.length-1;
        while(right>left){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String s = sc.nextLine();
        char[] charArray= s.toCharArray();
        reversing(charArray);
        System.out.println(charArray);
    }
}

