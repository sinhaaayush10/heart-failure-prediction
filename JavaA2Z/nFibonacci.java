import java.util.Scanner;
class nFibonacci{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter The Number: ");
int n=sc.nextInt();
System.out.println("The First "+n +" Fibonacci is:  ");
int a=0;
int b =1;
for(int i=0;i<=n;i++){
System.out.print(a+" ");
int c =a+b;
a=b;
b=c;
}
}
}