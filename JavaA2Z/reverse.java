import java.util.Scanner;
class reverse{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
int n = sc.nextInt();
while(n>0){
int dig = n%10;
n= n/10;
System.out.print(dig);
}
}
}