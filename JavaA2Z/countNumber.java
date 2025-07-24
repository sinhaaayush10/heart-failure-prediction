import java.util.Scanner;
class countNumber{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
long n = sc.nextInt();
long dig=0;
while(n !=0){
n = n/10;
dig++;
}
System.out.print(dig);
}
} 
