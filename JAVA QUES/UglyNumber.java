public class UglyNumber {
    public static void main(String[] args) {
        int number = 12;  
        boolean isUgly = true;
        if (number <= 0) {
            isUgly = false;
        }
        while (number > 1 && number % 2 == 0) {
            number = number / 2;
        }
        while (number > 1 && number % 3 == 0) {
            number = number / 3;
        }
        while (number > 1 && number % 5 == 0) {
            number = number / 5;
        }
        if (number == 1) {
            isUgly = true;
        } else {
            isUgly = false;
        }
        if (isUgly) {
            System.out.println("ugly number");
        } else {
            System.out.println("not an ugly number");
        }
    }
}