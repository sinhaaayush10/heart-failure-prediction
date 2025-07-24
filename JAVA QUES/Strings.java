import java.io.*;
public class Strings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        String str1 = reader.readLine();
        System.out.println();
        String str2 = reader.readLine();  
            if (areStringsEqual(str1, str2)) {
            System.out.println(1); 
        } else {
            System.out.println(0);      
  }
    }
      public static boolean areStringsEqual(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
             for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }  
        return true; 
    }
}
