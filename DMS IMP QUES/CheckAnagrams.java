import java.util.Arrays;
import java.util.Scanner;
public class CheckAnagrams {
    public static boolean isAnagrams(String s1, String s2){
        if(s1.length() != s1.length()){
            return false;
        } else{
            char[] ch1= s1.toCharArray();
            char[] ch2= s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2)){
                return true;
            }else{
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the 2 strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(isAnagrams(s1, s2)){
            System.out.println("Yes "+s1+" and "+s2+" are anagrams");
        }else{
            System.out.println("No "+s1+"and "+s2+" are not anagrams");
        }
    }
}
