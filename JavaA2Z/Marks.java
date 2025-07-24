import java.util.Scanner;
public class marks{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Marks OF The Student=");
 int  mrk= sc.nextInt();
if(mrk>90){
System.out.println("Excellent=");
}
else if(mrk>=80){
System.out.println("Good=");
}
else if(mrk>=70){
System.out.println("Fair=");
}
else if(mrk>=60){
System.out.println("Meets Exception=");
}
else{
System.out.println("Below Par=");
}
}
}