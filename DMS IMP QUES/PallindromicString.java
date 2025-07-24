import java.util.Scanner;
public class PallindromicString {
    public static void CheckString(String str){
        String rev ="";
        for(int i=str.length()-1;i>=0;i--){
           rev = rev+str.charAt(i); 
        }
        if(str.toLowerCase().equals(rev.toLowerCase())){
            System.out.println("Yes it is a Pallindromic String.");
        }else{
            System.out.println("Not a Pallindromic String.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        CheckString(str);

    }
    
}
