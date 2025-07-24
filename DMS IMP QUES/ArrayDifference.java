import java.util.Scanner;
    public class ArrayDifference {
    public static void main(String[] args) throws Exception {        //clear understand.......
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
        }                                                           // clear understand....
        int diff[] = new int[n2];
        int carry =0;
        int i=a1.length-1;
        int j=a2.length-1;
        int k=diff.length-1;
        while(k>=0){
            int digit = a2[j] +carry;
            if(i>=0){
                digit = digit- a1[i];
            } if(digit <0){
                carry = -1;
                digit += 10;
            }
           else{ 
            carry = 0;
            }
            diff[k] = digit;
            i--;
            j--;
            k--;  
        }
            int index =0;
            while(index < diff.length){
                if(diff[index] == 0){
                    index ++;
                }else{
                    break;
                }
            }
            while(index < diff.length){
                System.out.print("The Solution is: "+diff[index]);
                index++;
            }
        }
    }
    
