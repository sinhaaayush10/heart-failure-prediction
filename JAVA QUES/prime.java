import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class prime {
    public static void main(String[] args) throws IOException {
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter No. ");  
        int num = Integer.parseInt(br.readLine());
        int number = 1, count = 0, i;
        while (count < num) {
            number = number + 1;
            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                                      break;
                }
            }
            if (i == number) {
                                count = count + 1;
            }
        }
        System.out.println(number);
    }
}
