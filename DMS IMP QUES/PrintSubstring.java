import java.util.Scanner;
public class PrintSubstring {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String s1 = sc.nextLine();
    for(int i=0; i<s1.length();i++){
        for(int j = i+1;j<=s1.length();j++){
            System.out.println(s1.substring(i,j));
        }
    }
}
}