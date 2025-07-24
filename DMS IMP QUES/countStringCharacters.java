import java.util.Scanner;
public class countStringCharacters {
    public static void CountString(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) !=' '){
                count++;
            }
        }
        System.out.println("The total no of character in "+str+" is "+count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        CountString(str);
    }
}