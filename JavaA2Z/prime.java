import java.util.Scanner;
class prime{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter A number= ");
int n= sc.nextInt();
int count = 0;
for(int i=1; i<=n;i++){
if(n%i==0){
count++;
}
}
if(count==2){
System.out.print("Number is PRIME.");
}
else{
System.out.print("Not a Prime No.");
}
}
}