import java.util.Scanner;
public class countSubstring {
    public static int countSubstrings(String str) {
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                c++;
            }
        }
                return (c * (c - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String s = sc.nextLine();
        int result = countSubstrings(s);
        System.out.println(result);
    }
}
