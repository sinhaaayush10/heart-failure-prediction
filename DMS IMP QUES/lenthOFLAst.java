import java.util.Scanner;
public class lenthOFLAst {
    public static int lastWord(String s){
        String str = s.trim();
        int count =0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) !=' '){
                count++;
            } else{
            break;}
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
         System.out.print(lastWord(s));
    }
}
