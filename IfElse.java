import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("enter the num");
        num = scanner.nextInt();
        if(num<18){
            System.out.println("num is lesss than 18");
        }
        else if(num<25){
            System.out.println("num less than 25");
        }
        else
        System.out.println("num>25");
        scanner.close();
    }
}
