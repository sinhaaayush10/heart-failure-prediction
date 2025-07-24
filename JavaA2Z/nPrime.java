import java.util.Scanner;
class main{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
System.out.print("Enter Lower Limit: ");
   int low = sc.nextInt();
System.out.print("Enter Higher Limit: ");
   int high= sc.nextInt();
System.out.print("Prime No. Between "+low+" and "+high+" is = "+" ");
for(int i=low ;   i<=high ; i++ ){
int count =0;
for(int div=2; div*div<=i; div++){
if(i%div ==0){
count++;
break;
}
}
if(count==0){
System.out.print(" "+i+" ");
}
}
}
}