import java.util.Scanner;
public class Student {
    String name;
    int age;
    Student() {
        System.out.println("No info given");
    }
    Student(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }
    void showInfo() {
        System.out.println("Student: " + name);
    }
    void showInfo(String course) {
        System.out.println(name + " is in " + course);
    }
    static void college() {
        System.out.println("College: XYZ Institute");
    }
    static void college(String city) {
        System.out.println("Located in: " + city);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Course: ");
        String course = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        new Student();                    
        new Student(name);                  
        Student s = new Student(name, age); 
        s.showInfo();           
        s.showInfo(course);     
        Student.college();      
        Student.college(city);  
        sc.close();
    }
}
