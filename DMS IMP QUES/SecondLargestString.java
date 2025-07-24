import java.util.Scanner;
public class SecondLargestString {
    public static int SecondLargestStr(String s){
        int Largest = -1;
        int SecondLargest = -1;
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                int digit = ch - '0';
                if(digit > Largest){
                    SecondLargest = Largest;
                    Largest = digit;
                } else if( digit > SecondLargest && digit < Largest){
                    SecondLargest = digit;
                }
            }
        }
        return SecondLargest;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        int stringis = SecondLargestStr(s);
        System.out.print(stringis);
    }
    
}
