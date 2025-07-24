class Pallindrom{
static Boolean pallindrom (int i,  String s){
if(i>= s.length()/2) return true;
if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
  return  pallindrom (i+1,s);
}
public static void main(String args[]){
String s = "MADAM";
System.out.println(pallindrom(0,s));
}
}