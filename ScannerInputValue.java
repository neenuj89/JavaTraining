import java.util.Scanner;

public class ScannerInputValue {
     public static void main(String[] args) {
        String name;
        int age;

    Scanner scannerObj = new Scanner(System.in); 
    System.out.println("Enter name");
    name = scannerObj.nextLine();  
System.out.println("Enter age");
     age = scannerObj.nextInt();  
    System.out.println("Name: " + name);  
    System.out.println("Age: " + age);  
  }
    
}
