import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class LongestSubstringWithoutReapitingChar {
    public static void LongestSubstring(String s){
        int start=0,end=0;
        int maxLength=0;
        List<Character> list = new ArrayList<Character>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                maxLength=Math.max(maxLength,list.size());
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        System.out.print("The Longest Substring without repeating Character is: "+maxLength);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        LongestSubstring(s);
    }    
}
