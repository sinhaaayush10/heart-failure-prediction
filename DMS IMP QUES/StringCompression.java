import java.util.Scanner;
public class StringCompression {
    public static String compression1(String str){
        String s = str.charAt(0)+"";
        for(int i =1; i<str.length();i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i-1);
            if(curr != pre){
                s += curr;
            }
        }
        return s;
    }
    public static String compression2(String str){
        String s = str.charAt(0)+"";
        int count =1;
        for(int i=1;i< str.length();i++){
            char curr = str.charAt(i);
            char pre= str.charAt(i-1);
            if(curr == pre){
                count++;
            }else{
                if(count>1){
                    s += count;
                    count =1;
                }
                s += curr;
                }
                } 
                 if(count>1){
                    s += count;
                    count =1;
                }
                 return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER STRING: ");
        String str = sc.nextLine();
       System.out.println(compression1(str));
              System.out.println(compression2(str));

    }
    
}
