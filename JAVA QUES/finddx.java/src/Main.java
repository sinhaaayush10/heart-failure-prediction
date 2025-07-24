import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];
        int i;
        //input
        for(i = 0;i<size;i++) {
            numbers[i] = sc.nextInt();
        }
            int x=sc.nextInt();

            //output
            for( i = 0; i<numbers.length; i++){
                if(numbers[i] == x)
                System.out.println(i);
            }
        }
    }
