import java.util.Scanner;
public class largestpallindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("");
        String str = sc.nextLine();
        int maxLength = 1; 
        String longest = str.substring(0, 1); 
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                    if (sub.length() > maxLength) {
                        maxLength = sub.length();
                        longest = sub;
                    }
                }
            }
        }
        System.out.println("" + longest);
    }
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
//largest pallindrom question imp ho skta haii...
