import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int num = 0, limit = 0, i = 0;
        System.out.println("enter the num");
        num = scanner.nextInt();
        System.out.println("Enter the limit of multiplication table");
        limit = scanner.nextInt();

        System.out.println("Mutiplication table\n-----for loop--------\n");
        for (i = 0; i < limit; i++) {
            System.out.printf(" %d * %d =%d\n", num, i, num * i);
        }
        
        System.out.println("--------while loop-----------------\n");
        i = 0;
        while (i < limit) {
            System.out.printf(" %d * %d =%d\n", num, i, num * i);
            i++;
        }
        
        i = 0;
        System.out.println("------------do-while loop------------\n");
        do {
            System.out.printf(" %d * %d =%d\n", num, i, num * i);
            i++;
        } while (i < limit);
        scanner.close(); 
    }
}
