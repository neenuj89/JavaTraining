import java.util.Scanner;

public class SchoolUserInput {
    
    public static void main(String[] args) {
        Scanner data1 =new Scanner(System.in);
        Student student1=new Student();
        System.out.println("Student1 details. 1. name, 2.age,3.Reg num");
        student1.name=data.nextLine();
        student1.age=data.nextInt();
        student1.regNum=data.next();
        
        Student student2=new Student();
        System.out.println("Student2 details. 1. name, 2.age,3.Reg num");
        student2.name=data.nextLine();
        student2.age=data.nextInt();
        student2.regNum=data.next();
        
        System.out.println("Student1 details");
        System.out.println("name: "+student1.name);
        System.out.println("age: "+student1.age);
        System.out.println("Register num: "+student1.regNum);
        
        System.out.println("Student2 details");
        System.out.println("name: "+student2.name);
System.out.println("age: "+student2.age);
System.out.println("name: "+student2.regNum);
      
    }
}
