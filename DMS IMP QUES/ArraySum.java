import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Elements: ");
        int a1[] = new int[n1];
        for(int i=0; i<n1;i++){
            a1[i] = sc.nextInt();
        }

         System.out.print("Enter Size of Array 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter Elements: ");
        int a2[] = new int[n2];
        for(int i=0; i<n2;i++){
            a2[i] = sc.nextInt();
        }

        int sum[] = new int[n1 >n2? n1:n2];
        int carry =0;
        int i=a1.length-1;
        int j=a2.length-1;
        int k=sum.length-1;

        while(k>=0){
            int digit = carry;
            if(i>=0){
                digit += a1[i];
            } if(j >=0){
                digit += a2[j];
            }

            carry = digit/10;
            sum[k] = digit%10;
            i--;
            j--;
            k--;
        }
            if(carry != 0){
                System.out.print(carry+" ");
            }
            for(int val:sum){
                System.out.print(val +" ");
            }

        }

    }
    

