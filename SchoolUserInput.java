import java.util.Scanner;

public class SchoolUserInput {
    
    public static void main(String[] args) {
        Scanner data1 =new Scanner(System.in);
        Student student1=new Student();
        System.out.println("Student 1 details. 1. name, 2.age,3.Reg num");
    student1.name=data1.nextLine();
        student1.age=data1.nextInt();
        student1.regNum=data1.next();
        
        Student student2=new Student();
        System.out.println("Student 2 details. 1. name, 2.age,3.Reg num");
    student2.name=data1.next();
        student2.age=data1.nextInt();
        student2.regNum=data1.next();

        System.out.println("Student 1 details");
        System.out.println("name: "+student1.name);
System.out.println("age: "+student1.age);
System.out.println("name: "+student1.regNum);
        System.out.println("Student2 details");
        System.out.println("name: "+student2.name);
System.out.println("age: "+student2.age);
System.out.println("name: "+student2.regNum);
      data1.close();
    }
}
