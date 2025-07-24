import java.util.Scanner;
public class togglecase {
    public static String toggle(String str){
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch<='z'){
                char UC =(char)('A'+ ch-'a');
                sb.setCharAt(i,UC);
            }else if(ch>= 'A' && ch<='Z'){
                char LC = (char)('a'+ ch - 'A');
                sb.setCharAt(i,LC);
                }
            }
            return sb.toString();
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print(toggle(str));
    }
}
